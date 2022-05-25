package pt.alticelabs.rule_matcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableJpaRepositories
@SpringBootApplication
public class RuleMatcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuleMatcherApplication.class, args);
	}

}
