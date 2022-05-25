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



    
    public static boolean match(Rule rule, EquipmentScenary scenary) {
        if(rule.getFirmwareVersion() != null) {
           if(!firmware_version_checker(rule, scenary)) {
               return false;
           }
        }
        if(rule.getOlt() != null) {
            if(!scenary.getOlt().equals(rule.getOlt())) {
                return false;
            }
        }
        if(rule.getCardInterface() != null) {
            if(!scenary.getCardInterface().equals(rule.getCardInterface())) {
                return false;
            }
        }
        if(rule.getEquipmentId() != null) {
            if(!scenary.getEquipmentId().equals(rule.getEquipmentId())) {
                return false;
            }
        }
        if(rule.getPassword() != null) {
            if(!scenary.getPassword().equals(rule.getPassword())) {
                return false;
            }
        }
        return true;
    }
}
