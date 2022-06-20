package pt.alticelabs.rule_matcher.utils;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import pt.alticelabs.rule_matcher.antlr4.firmwareVersion.FirmwareVersionLexer;
import pt.alticelabs.rule_matcher.antlr4.firmwareVersion.FirmwareVersionParser;
import pt.alticelabs.rule_matcher.exceptions.InvalidFirmwareVersionExpressionException;
import pt.alticelabs.rule_matcher.model.VersionRule;

public class FirmwareVersionGrammar {

    public static void expression_validator(String expression) throws InvalidFirmwareVersionExpressionException {
        CharStream cs = CharStreams.fromString(expression);
        FirmwareVersionLexer firmwareVersionLexer = new FirmwareVersionLexer(cs);
        CommonTokenStream commonTokenStream = new CommonTokenStream(firmwareVersionLexer);
        FirmwareVersionParser firmwareVersionParser = new FirmwareVersionParser(commonTokenStream);
        firmwareVersionParser.removeErrorListeners();
        firmwareVersionParser.setErrorHandler(new BailErrorStrategy());
        try {
            firmwareVersionParser.expression();
            return;
        } catch(ParseCancellationException e) {
            throw new InvalidFirmwareVersionExpressionException("The provided firmware expression is not valid");
        }
    }

    public static VersionRule generate_version_rule_fields(String expression) {
        String[] expression_parts = expression.split(" ");
        String[] version_splits = expression.split(".");
        String definer = expression_parts[0];
        int major = Integer.parseInt(version_splits[0]);
        int minor = Integer.parseInt(version_splits[1]); 
        int patch = Integer.parseInt(version_splits[2]);
        return new VersionRule(definer, major, minor, patch);
    }
    
}
