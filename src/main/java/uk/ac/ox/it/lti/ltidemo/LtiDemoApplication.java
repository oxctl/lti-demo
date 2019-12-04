package uk.ac.ox.it.lti.ltidemo;

import edu.ksu.lti.launch.service.LtiLoginService;
import edu.ksu.lti.launch.service.SimpleLtiLoginService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class LtiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtiDemoApplication.class, args);
	}

	@Bean
	public LtiLoginService ltiLoginService() {
		return new FixedLtiLoginService();
	}

}
