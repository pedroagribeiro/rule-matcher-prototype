package pt.alticelabs.rule_matcher.utils;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import pt.alticelabs.rule_matcher.antlr4.ipAddress.IpAddressLexer;
import pt.alticelabs.rule_matcher.antlr4.ipAddress.IpAddressParser;
import pt.alticelabs.rule_matcher.exceptions.InvalidIpAddressExpressionException;
import pt.alticelabs.rule_matcher.model.IpAddressRule;

public class IpAddressGrammar {

    public static void expression_validator(String expression_string) throws InvalidIpAddressExpressionException {
        CharStream cs = CharStreams.fromString(expression_string);
        IpAddressLexer ipLexer = new IpAddressLexer(cs);
        CommonTokenStream commonTokenStream = new CommonTokenStream(ipLexer);
        IpAddressParser ipAddressParser = new IpAddressParser(commonTokenStream);
        ipAddressParser.removeErrorListeners();
        ipAddressParser.setErrorHandler(new BailErrorStrategy());
        try {
            ipAddressParser.expression();
            return;
        } catch(ParseCancellationException e) {
            throw new InvalidIpAddressExpressionException("The provided ip expression is not valid");
        }
    }

    public static IpAddressRule generate_ip_rule_fields(String expression) {
        String[] expression_parts = expression.split(" ");
        String[] version_splits = expression.split(".");
        String definer = expression_parts[0];
        int first_bit = Integer.parseInt(version_splits[0]);
        int second_bit = Integer.parseInt(version_splits[1]); 
        int third_bit = Integer.parseInt(version_splits[2]);
        int fourth_bit = Integer.parseInt(version_splits[3]);
        return new IpAddressRule(definer, first_bit, second_bit, third_bit, fourth_bit);
    }
}
