package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@EnableScheduling
public class DemoApplication implements CommandLineRunner {
	RestTemplate restTemplate = new RestTemplate();

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String args[]) {
		SpringApplication.run(DemoApplication.class);
	}

	public void run(String... args) throws Exception {

		Response response = restTemplate.getForObject(
				"http://localhost:8888/persons/1",
				Response.class);
		log.info("==== RESTful API Response using Spring RESTTemplate START =======");
		log.info(response.toString());
		log.info("==== RESTful API Response using Spring RESTTemplate END =======");
	}
}
