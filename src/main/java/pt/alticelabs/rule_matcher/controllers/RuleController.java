package pt.alticelabs.rule_matcher.controllers;

import javax.validation.Valid;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.alticelabs.rule_matcher.antlr4.firmwareVersion.FirmwareVersionLexer;
import pt.alticelabs.rule_matcher.antlr4.firmwareVersion.FirmwareVersionParser;
import pt.alticelabs.rule_matcher.exceptions.InvalidFirmwareVersionExpressionException;
import pt.alticelabs.rule_matcher.exceptions.InvalidIpAddressExpressionException;
import pt.alticelabs.rule_matcher.model.EquipmentScenary;
import pt.alticelabs.rule_matcher.model.Parameter;
import pt.alticelabs.rule_matcher.model.Rule;
import pt.alticelabs.rule_matcher.repository.RuleRepository;
import pt.alticelabs.rule_matcher.utils.Matcher;

@RestController
@RequestMapping("/rules")
public class RuleController {

    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired RuleRepository ruleRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Rule>> getRulesNoFilter() {
        Iterable<Rule> storedRules = this.ruleRepository.findAll();
        return new ResponseEntity<>(storedRules, HttpStatus.OK);
    } 

    @PostMapping("")
    public ResponseEntity<?> saveRule(@RequestBody Rule rule) {
        try {
            rule.validate();
        } catch(InvalidFirmwareVersionExpressionException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(InvalidIpAddressExpressionException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        for(Parameter p : rule.getParameters()) {
            p.setRule(rule);
        }
        this.ruleRepository.save(rule);
        return new ResponseEntity<>("Successfuly created the rule", HttpStatus.CREATED);
    }

    @GetMapping("/match")
    public ResponseEntity<?> matchEquipment(@Valid @RequestBody EquipmentScenary scenary) {
        Rule matched_rule = null;
        int currently_matched_parameters = 0;
        int current_priority = Integer.MAX_VALUE;
        Iterable<Rule> rules = this.ruleRepository.findAll();
        for(Rule rule : rules) {
            int matched_params = Matcher.match(rule, scenary);
            if((rule.getPriority() < current_priority) && matched_params > 0) {
                matched_rule = rule;
                currently_matched_parameters = Matcher.match(rule, scenary);
                current_priority = rule.getPriority();
            }
            if((rule.getPriority() == current_priority) && matched_params > 0) {
                int matched_parameters = Matcher.match(rule, scenary);
                if(matched_parameters > currently_matched_parameters) {
                    matched_rule = rule;
                    currently_matched_parameters = matched_parameters;
                }            
            }
        }
        if(matched_rule == null) {
            return new ResponseEntity<>("Could not find a matching rule", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(matched_rule, HttpStatus.OK);
        }
    }

    @GetMapping("/antlr")
    public ResponseEntity<?> testGrammar(@RequestBody String expression_string) {
        CharStream cs = CharStreams.fromString(expression_string);
        FirmwareVersionLexer ip_lexer = new FirmwareVersionLexer(cs);
        CommonTokenStream commonTokenStream = new CommonTokenStream(ip_lexer);
        FirmwareVersionParser firmwareVersionParser = new FirmwareVersionParser(commonTokenStream);
        firmwareVersionParser.removeErrorListeners();
        firmwareVersionParser.setErrorHandler(new BailErrorStrategy());
        try {
            firmwareVersionParser.expression();
        } catch(ParseCancellationException e) {
            e.printStackTrace();
            return new ResponseEntity<>("The provided expression does ", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("Seems ok", HttpStatus.OK);
    }
}
