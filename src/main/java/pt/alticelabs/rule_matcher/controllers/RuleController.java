package pt.alticelabs.rule_matcher.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
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
import pt.alticelabs.rule_matcher.model.EquipmentScenary;
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
        boolean valid = rule.validate();
        if(valid) {
            this.ruleRepository.save(rule);
            return new ResponseEntity<>("Successfuly created the rule", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("The syntax of the provided rule is not valid", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/match")
    public ResponseEntity<?> matchEquipment(@Valid @RequestBody EquipmentScenary scenary) {
        Rule matched_rule = null;
        int currently_matched_parameters = 0;
        Iterable<Rule> rules = this.ruleRepository.findAll();
        for(Rule rule : rules) {
            int matched_parameters = Matcher.match(rule, scenary);
            if(matched_parameters > currently_matched_parameters) {
                matched_rule = rule;
                currently_matched_parameters = matched_parameters;
            }
        }
        if(matched_rule == null) {
            return new ResponseEntity<>("Could not find a matching rule", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(matched_rule, HttpStatus.OK);
        }
    }
}
