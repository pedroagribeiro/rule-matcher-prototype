package pt.alticelabs.rule_matcher.model;


public class IpAddressRule {
   
    public String definer;
    public int first_bit;
    public int second_bit;
    public int third_bit;
    public int fourth_bit;

    public IpAddressRule(String definer, int first_bit, int second_bit, int third_bit, int fourth_bit) {
        this.definer = definer;
        this.first_bit = first_bit;
        this.second_bit = second_bit;
        this.third_bit = third_bit;
        this.fourth_bit = fourth_bit;
    }

    public String getDefiner() {
        return this.definer;
    }

    public int getFirstBit() {
        return this.first_bit;
    }

    public int getSecondBit() {
        return this.second_bit;
    }

    public int getThirdBit() {
        return this.third_bit;
    }

    public int getFourthBit() {
        return this.fourth_bit;
    }
}
