package pt.alticelabs.rule_matcher.model;

public class VersionRule {

    private String definer;
    private int major;
    private int minor;
    private int patch;

    public VersionRule(String definer, int major, int minor, int patch) {
        this.definer = definer;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    public String getDefiner() {
        return this.definer;
    }

    public int getMajor() {
        return this.major;
    }

    public int getMinor() {
        return this.minor;
    }

    public int getPatch() {
        return this.patch;
    }

}
