package pt.alticelabs.rule_matcher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pt.alticelabs.rule_matcher.model.Rule;

@Repository
public interface RuleRepository extends CrudRepository<Rule, Integer> {

    @Query(value = "SELECT * FROM rules WHERE :ip ~ ip_address", nativeQuery = true)
    List<Rule> findRuleWithMatchingIp(@Param("ip") String ip);

    @Query(value = "SELECT * FROM rules WHERE :fw_version ~ fw_version", nativeQuery = true)
    List<Rule> findRuleWithMatchingFwVersion(@Param("fw_version") String fw_version);

    @Query(value = "SELECT * FROM rules WHERE :ip ~ ip_address AND :fw_version ~ fw_version", nativeQuery = true)
    List<Rule> findRuleWithMatchingIpAndFwVersion(@Param("ip") String ip, @Param("fw_version") String fw_version);

    @Query(value = "SELECT * FROM rules WHERE :fw_version ~ fw_version AND :ip ~ ip_address AND :olt = olt AND :card = card = AND :card_interface = card_interface AND :equipment_id = equipment_id", nativeQuery = true)
    List<Rule> findRuleMatchingScenary(@Param("fw_version") String fw_version, @Param("ip") String ip, @Param("olt") String olt, @Param("card") String card, @Param("card_interface") String card_interface, @Param("equipment_id") String equipment_id);

}
