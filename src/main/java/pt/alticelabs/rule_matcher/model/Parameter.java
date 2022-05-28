package pt.alticelabs.rule_matcher.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "parameters")
public class Parameter {

    @Id
    @GeneratedValue(generator = "parameter_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "parameter_id_seq", sequenceName = "parameter_id_seq", allocationSize = 1)
    @JsonIgnore
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "value", nullable = false)
    private String value;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rule_token", referencedColumnName = "token")
    @JsonIgnore
    private Rule rule;

    public Parameter() {}

    public Parameter(String name, String value, Rule rule) {
        this.name = name;
        this.value = value;
        this.rule = rule;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", rule=" + rule +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter parameter = (Parameter) o;
        return Objects.equals(id, parameter.id) && Objects.equals(name, parameter.name) && Objects.equals(value, parameter.value) && Objects.equals(rule, parameter.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value, rule);
    }
}
