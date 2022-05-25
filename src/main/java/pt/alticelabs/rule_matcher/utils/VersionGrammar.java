package pt.alticelabs.rule_matcher.utils;

import java.util.ArrayList;
import java.util.Arrays;

import pt.alticelabs.rule_matcher.model.VersionRule;

public class VersionGrammar {

    private static ArrayList<String> allowed_definers = new ArrayList<>(Arrays.asList("lt", "eq", "gt"));
    private static String version_regex = "[0-9]+.[0-9]+.[0-9]+";

    public static boolean expression_validator(String expression) {
        String[] expression_parts = expression.split(" ");
        boolean is_definer_valid = VersionGrammar.allowed_definers.contains(expression_parts[0]); 
        boolean is_version_valid = expression_parts[1].matches(VersionGrammar.version_regex);
        return is_definer_valid && is_version_valid;
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
