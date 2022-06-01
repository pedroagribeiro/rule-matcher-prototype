package pt.alticelabs.rule_matcher.utils;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.alticelabs.rule_matcher.exceptions.InvalidFirmwareVersionExpressionException;
import pt.alticelabs.rule_matcher.model.VersionRule;

public class VersionGrammar {

    private static ArrayList<String> allowed_definers = new ArrayList<>(Arrays.asList("lt", "eq", "gt"));
    private static String version_regex = "[0-9]+.[0-9]+.[0-9]+";

    public static void expression_validator(String expression) throws InvalidFirmwareVersionExpressionException {
        ArrayList<String> single_expressions = Matcher.split_expression(expression);
        single_expressions.remove(0);
        for(String single_expression : single_expressions) {
            String[] expression_bits = single_expression.split(" ");
            boolean is_definer_valid = allowed_definers.contains(expression_bits[0]);
            boolean is_version_valid = expression_bits[1].matches(version_regex);
            if(!is_definer_valid || !is_version_valid) throw new InvalidFirmwareVersionExpressionException("The provided firmware version expression is not valid");
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
