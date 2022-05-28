package pt.alticelabs.rule_matcher.utils;

import com.vdurmont.semver4j.Semver;
import pt.alticelabs.rule_matcher.model.EquipmentScenary;
import pt.alticelabs.rule_matcher.model.Rule;

public class Matcher {

    private static boolean firmware_version_checker(Rule rule, EquipmentScenary scenary) {
        String[] firmware_rule_splits = rule.getFirmwareVersion().split(" ");
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
        return false;
    }

    private static boolean ip_address_checker(Rule rule, EquipmentScenary scenary) {
        String[] ip_address_rule_splits = rule.getIpAddress().split(" ");
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
