package pt.alticelabs.rule_matcher.model;

import pt.alticelabs.rule_matcher.exceptions.InvalidFirmwareVersionExpressionException;
import pt.alticelabs.rule_matcher.exceptions.InvalidIpAddressExpressionException;
import pt.alticelabs.rule_matcher.utils.IpAddressGrammar;
import pt.alticelabs.rule_matcher.utils.FirmwareVersionGrammar;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "rules")
public class Rule {

    @Id
    @GeneratedValue(generator = "rule_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "rule_id_seq", sequenceName = "rule_id_seq", allocationSize = 1)
    private Long token;

    @Column(name = "fw_version")
    private String firmwareVersion;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "olt")
    private String olt;

    @Column(name = "card")
    private String card;

    @Column(name = "interface")
    private String cardInterface;

    @Column(name = "equipment_id")
    private String equipmentId;

    @Column(name = "password")
    private String password;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "template")
    private String template;

    @Column(name = "priority", nullable = false)
    private int priority;

    @OneToMany(mappedBy = "rule", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Parameter> parameters = new HashSet<>();

    public Rule() {}

    public Rule(String firmwareVersion, String ipAddress, String olt, String card, String cardInterface, String equipmentId, String password, String vendor, String template, int priority, Set<Parameter> parameters) {
        this.firmwareVersion = firmwareVersion;
        this.ipAddress = ipAddress;
        this.olt = olt;
        this.card = card;
        this.cardInterface = cardInterface;
        this.equipmentId = equipmentId;
        this.password = password;
        this.vendor = vendor;
        this.template = template;
        this.priority = priority;
        this.parameters = parameters;
    }

    public void validate() throws InvalidFirmwareVersionExpressionException, InvalidIpAddressExpressionException {
        if(this.firmwareVersion != null) {
            FirmwareVersionGrammar.expression_validator(this.firmwareVersion);
        }
        if(this.ipAddress != null) {
            IpAddressGrammar.expression_validator(this.ipAddress);
        }
    }

    public void setToken(Long token) {
        this.token = token;
    }

    public Long getToken() {
        return this.token;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setOlt(String olt) {
        this.olt = olt;
    }

    public String getOlt() {
        return this.olt;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCard() {
        return this.card;
    }

    public void setCardInterface(String cardInterface) {
        this.cardInterface = cardInterface;
    }

    public String getCardInterface() {
        return this.cardInterface;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentId() {
        return this.equipmentId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setParameters(Set<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Set<Parameter> getParameters() {
        return this.parameters;
    }

    @Override
    public String toString() {
        return "Rule{" +
            "token=" + token + ", " +
            "firmwareVersion=" + firmwareVersion + ", " +
            "ipAddress=" + ipAddress + ", " +
            "olt=" + olt + ", " +
            "card=" + card + ", " + 
            "cardInterface=" + cardInterface + ", " +
            "equipmentId=" + equipmentId + ", " +
            "password=" + password + ", " +
            "vendor=" + vendor + ", " +
            "template=" + template + ", " +
            "priority=" + priority + ", " +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Rule rule = (Rule) o;
        return (
            token == rule.token &&
            Objects.equals(firmwareVersion, rule.firmwareVersion) &&
            Objects.equals(ipAddress, rule.ipAddress) &&
            Objects.equals(olt, rule.olt) &&
            Objects.equals(card, rule.card) &&
            Objects.equals(cardInterface, rule.cardInterface) &&
            Objects.equals(equipmentId, rule.equipmentId) &&
            Objects.equals(password, rule.password) &&
            Objects.equals(vendor, rule.vendor) &&
            Objects.equals(template, rule.template) &&
            priority == rule.priority
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            token,
            firmwareVersion,
            ipAddress,
            olt,
            card,
            cardInterface,
            equipmentId,
            password,
            vendor,
            template,
            priority
        );
    }
}
