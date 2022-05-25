package pt.alticelabs.rule_matcher.utils;

import java.util.ArrayList;
import java.util.Arrays;

import pt.alticelabs.rule_matcher.model.IpAddressRule;

public class IpAddressGrammar {

    private static ArrayList<String> allowed_definers = new ArrayList<>(Arrays.asList("eq"));
    private static String ip_address_regex = "^(?:[0-9]{1,3}.){3}[0-9]{1,3}$";
   
    public static boolean expression_validator(String expression) {
        String[] expression_parts = expression.split(" ");
        boolean is_definer_valid = allowed_definers.contains(expression_parts[0]);
        boolean is_ip_address_valid = expression_parts[1].matches(ip_address_regex);
        return is_definer_valid && is_ip_address_valid;
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
