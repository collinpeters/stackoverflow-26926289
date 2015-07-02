package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@RequestMapping("/info")
	Info info() {
		return new Info();
	}

	/*
	 * @Bean
	 * public JodaModule jacksonJodaModule() {
	 * JodaModule module = new JodaModule();
	 * DateTimeFormatterFactory formatterFactory = new DateTimeFormatterFactory();
	 * formatterFactory.setIso(ISO.DATE);
	 * module.addSerializer(DateTime.class, new DateTimeSerializer(
	 * new JacksonJodaFormat(formatterFactory.createDateTimeFormatter()
	 * .withZoneUTC())));
	 * return module;
	 * }
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
