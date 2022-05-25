package pt.alticelabs.rule_matcher.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EquipmentScenary {
    
    @NotNull
    @Pattern(regexp = "^(?:[0-9]{1,3}\\.){2}[0-9]{1,3}$", message = "The provided firmware version must be valid")
    private String firmwareVersion;

    @NotNull
    @Pattern(regexp = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$", message = "The provided IP address must be valid")
    private String ipAddress;

    @NotNull
    private String olt;

    @NotNull
    private String card;

    @NotNull
    private String cardInterface;

    @NotNull
    private String equipmentId;

    @NotNull
    private String registrationType;

    @NotNull
    private String serialNumber;

    private String password;

    private String profile;

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getOlt() {
        return this.olt;
    }

    public String getCard() {
        return this.card;
    }

    public String getCardInterface() {
        return this.cardInterface;
    }

    public String getEquipmentId() {
        return this.equipmentId;
    }

    public String getRegistrationType() {
        return this.registrationType;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getPassword() {
        return this.password;
    }

    public String getProfile() {
        return this.profile;
    }

    @Override
    public String toString() {
        return "EquipmentScenary{" +
            "firmwareVersion=" + firmwareVersion + ", " +
            "ipAddress=" + ipAddress + ", " +
            "olt=" + olt + ", " +
            "card=" + card + ", " + 
            "cardInterface=" + cardInterface + ", " +
            "equipmentId=" + equipmentId + ", " +
            "registrationType=" + registrationType + ", " +
            "serialNumber=" + serialNumber + ", " +
            "password=" + password + ", " + 
            "profile=" + profile + 
            "}";
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        EquipmentScenary scenary = (EquipmentScenary) o;
        return (
            Objects.equals(firmwareVersion, scenary.firmwareVersion) &&
            Objects.equals(ipAddress, scenary.ipAddress) &&
            Objects.equals(olt, scenary.olt) &&
            Objects.equals(card, scenary.card) &&
            Objects.equals(cardInterface, scenary.cardInterface) &&
            Objects.equals(equipmentId, scenary.equipmentId) &&
            Objects.equals(registrationType, scenary.registrationType) &&
            Objects.equals(serialNumber, scenary.serialNumber) &&
            Objects.equals(password, scenary.password) &&
            Objects.equals(profile, scenary.profile)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            firmwareVersion,
            ipAddress,
            olt,
            card,
            cardInterface,
            equipmentId,
            registrationType,
            serialNumber,
            password,
            profile
        );
    }

}
