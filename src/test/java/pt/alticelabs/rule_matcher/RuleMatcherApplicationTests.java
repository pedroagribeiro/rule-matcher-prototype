package pt.alticelabs.rule_matcher;

import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pt.alticelabs.rule_matcher.model.Rule;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RuleMatcherApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	List<Rule> loadRulesFromFile(String filePath) {
		List<Rule> rules = new ArrayList<>();
		JSONParser parser = new JSONParser();
		Gson converter = new Gson();
		try (FileReader reader = new FileReader(filePath)) {
			Object obj = parser.parse(reader);
			JSONArray rulesList = (JSONArray) obj;
			rulesList.forEach(element -> {
				Rule rule = converter.fromJson(element.toString(), Rule.class);
				rules.add(rule);
			});
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ParseException e) {
			e.printStackTrace();
		}
		return rules;
	}

	@Test
	void contextLoads() {
	}

	// @Test
	// void submitStoredRules() {
	// 	List<Rule> rules = loadRulesFromFile("./src/main/resources/rules.json");
	// 	String url = "http://localhost:" + port + "/rules";
	// 	rules.forEach(rule -> {
	// 		ResponseEntity<String> response = this.restTemplate.postForEntity(url, rule, String.class);
	// 		Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
	// 	});
	// }

}
