package pt.alticelabs.rule_matcher.utils;

import com.google.gson.Gson;
import com.vdurmont.semver4j.Semver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import pt.alticelabs.rule_matcher.model.EquipmentScenary;
import pt.alticelabs.rule_matcher.model.Rule;

import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Arrays;

public class Matcher {

    static Logger log = LoggerFactory.getLogger("Matcher");
    static Gson converter = new Gson();

    private static ArrayList<String> split_expression(String expression) {
       ArrayList<String> tokens = new ArrayList<>(Arrays.asList("and", "or"));
       ArrayList<String> expression_parts = new ArrayList<>();
       boolean contains_and = expression.contains("and");
       boolean contains_or = expression.contains("or");
       if(contains_and) expression_parts.add("and");
       if(contains_or) expression_parts.add("or");
       if(!contains_and && !contains_or) expression_parts.add("");
       String[] expression_bits = expression.split(" ");
       String aggregator = "";
       int k = 0;
       for(int i = 0; i < expression_bits.length; i++) {
            if(!tokens.contains(expression_bits[i])) {
                if(k == 0) {
                    aggregator += expression_bits[i];
                    aggregator += " ";
                    k++;
                }
                if(k == 1) {
                    aggregator += expression_bits[1];
                    expression_parts.add(aggregator);
                    aggregator = "";
                    k = 0;
                }
            }
       }
       return expression_parts;
    }

    private static boolean firmware_version_single_checker(String expression, EquipmentScenary scenary) {
        String[] firmware_rule_splits = expression.split(" ");
        String definer = firmware_rule_splits[0];
        Semver rule_firmware_version = new Semver(firmware_rule_splits[1]);
        Semver equipment_firmware_version = new Semver(scenary.getFirmwareVersion());
        if(definer.equals("gt")) {
            return equipment_firmware_version.isGreaterThan(rule_firmware_version);
        }
        if(definer.equals("eq")) {
            return equipment_firmware_version.isEqualTo(rule_firmware_version);
        }
        if(definer.equals("lt")) {
            return equipment_firmware_version.isLowerThan(rule_firmware_version);
        }
        if(definer.equals("startswith")) {
            return scenary.getFirmwareVersion().startsWith(rule_firmware_version.toString());
        }
        if(definer.equals("endswith")) {
            return scenary.getFirmwareVersion().endsWith(rule_firmware_version.toString());
        }
        if(definer.equals("major")) {
            return equipment_firmware_version.getMajor().equals(rule_firmware_version.getMajor());
        }
        if(definer.equals("minor")) {
            return equipment_firmware_version.getMinor().equals(rule_firmware_version.getMinor());
        }
        if(definer.equals("patch")) {
            return equipment_firmware_version.getPatch().equals(rule_firmware_version.getPatch());
        }
        return false;
    }

    private static boolean ip_address_single_checker(String expression, EquipmentScenary scenary) {
        String[] ip_address_rule_splits = expression.split(" ");
        String definer = ip_address_rule_splits[0];
        if(definer.equals("eq")) {
            return scenary.getIpAddress().equals(ip_address_rule_splits[1]);
        }
        if(definer.equals("startswith")) {
            return scenary.getIpAddress().startsWith(ip_address_rule_splits[1]);
        }
        if(definer.equals("endswith")) {
            return scenary.getIpAddress().endsWith(ip_address_rule_splits[1]);
        }
        return false;
    }
    private static boolean check_firmware_version_logic_and(ArrayList<String> expressions, EquipmentScenary scenary) {
       for(String expression : expressions) {
           if(!firmware_version_single_checker(expression, scenary)) return false;
       }
       return true;
    }

    private static boolean check_firmware_version_logic_or(ArrayList<String> expressions, EquipmentScenary scenary) {
       for(String expression : expressions) {
           if(firmware_version_single_checker(expression, scenary)) return true;
       }
       return false;
    }

    private static boolean check_ip_address_logic_and(ArrayList<String> expressions, EquipmentScenary scenary) {
        for(String expression : expressions) {
            if(!ip_address_single_checker(expression, scenary)) return false;
        }
        return true;
    }

    private static boolean check_ip_address_logic_or(ArrayList<String> expressions, EquipmentScenary scenary) {
        for(String expression : expressions) {
            if(ip_address_single_checker(expression, scenary)) return true;
        }
        return false;
    }

    private static boolean firmware_version_checker(Rule rule, EquipmentScenary scenary) {
        boolean r;
        String firmware_rule = rule.getFirmwareVersion();
        ArrayList<String> broken_down_firmware_rule = Matcher.split_expression(firmware_rule);
        log.info("Expressao: " + converter.toJson(broken_down_firmware_rule));
        switch(broken_down_firmware_rule.remove(0)) {
            case "and":
                r = Matcher.check_firmware_version_logic_and(broken_down_firmware_rule, scenary);
                break;
            case "or":
                r = Matcher.check_firmware_version_logic_or(broken_down_firmware_rule, scenary);
                break;
            default:
                log.info("Expressao cortada: " + broken_down_firmware_rule);
                r = firmware_version_single_checker(broken_down_firmware_rule.get(0), scenary);
        }
        return r;
    }

    private static boolean ip_address_checker(Rule rule, EquipmentScenary scenary) {
        boolean r;
        String ip_address_rule = rule.getIpAddress();
        ArrayList<String> broken_down_ip_address_rule = Matcher.split_expression(ip_address_rule);
        log.info(converter.toJson(broken_down_ip_address_rule));
        switch(broken_down_ip_address_rule.remove(0)) {
            case "and":
                r = Matcher.check_ip_address_logic_and(broken_down_ip_address_rule, scenary);
                break;
            case "or":
                r = Matcher.check_ip_address_logic_or(broken_down_ip_address_rule, scenary);
                break;
            default:
                r = Matcher.ip_address_single_checker(broken_down_ip_address_rule.get(0), scenary);
        }
        return r;
    }
    
    public static int match(Rule rule, EquipmentScenary scenary) {
        int matched_parameters = 0;
        if(rule.getFirmwareVersion() != null) {
           if(firmware_version_checker(rule, scenary)) {
               matched_parameters++;
           } else {
               return 0;
           }
        }
        if(rule.getIpAddress() != null) {
            if(ip_address_checker(rule, scenary)) {
                matched_parameters++;
            } else {
                return 0;
            }
        }
        if(rule.getOlt() != null) {
            if(scenary.getOlt().equals(rule.getOlt())) {
                matched_parameters++;
            } else {
                return 0;
            }
        }
        if(rule.getCardInterface() != null) {
            if(scenary.getCardInterface().equals(rule.getCardInterface())) {
                matched_parameters++;
            } else {
                return 0;
            }
        }
        if(rule.getEquipmentId() != null) {
            if(scenary.getEquipmentId().equals(rule.getEquipmentId())) {
                matched_parameters++;
            } else {
                return 0;
            }
        }
        if(rule.getPassword() != null) {
            if(scenary.getPassword().equals(rule.getPassword())) {
                matched_parameters++;
            } else {
                return 0;
            }
        }
        return matched_parameters;
    }
}
