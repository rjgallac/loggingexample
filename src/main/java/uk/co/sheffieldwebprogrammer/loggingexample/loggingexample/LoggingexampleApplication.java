package uk.co.sheffieldwebprogrammer.loggingexample.loggingexample;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingexampleApplication.class, args);
	}

}
