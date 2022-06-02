package pt.alticelabs.rule_matcher.utils;

import java.util.ArrayList;
import java.util.Arrays;

import pt.alticelabs.rule_matcher.exceptions.InvalidIpAddressExpressionException;
import pt.alticelabs.rule_matcher.model.IpAddressRule;

public class IpAddressGrammar {

    private static ArrayList<String> allowed_definers = new ArrayList<>(Arrays.asList("eq", "startswith", "endswith"));
    private static String ip_address_regex = "^(?:[0-9]{1,3}.){3}[0-9]{1,3}$";
   
    public static void expression_validator(String expression) throws InvalidIpAddressExpressionException {
        ArrayList<String> single_expressions = Matcher.split_expression(expression);
        String definer = single_expressions.remove(0);
        for(String single_expression : single_expressions) {
            String[] expression_bits = single_expression.split(" ");
            boolean is_definer_valid = allowed_definers.contains(expression_bits[0]);
            boolean is_ip_address_valid = true;
            if(definer.equals("eq")) {
                is_ip_address_valid = expression_bits[1].matches(ip_address_regex);
            }
            if(!is_definer_valid || !is_ip_address_valid) throw new InvalidIpAddressExpressionException("The provided ip address expression is not valid");
        }
        if(single_expressions.size() == 0) throw new InvalidIpAddressExpressionException("The provided ip address expression is not valid");
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
