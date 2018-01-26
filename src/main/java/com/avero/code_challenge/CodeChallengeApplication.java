package com.avero.code_challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CodeChallengeApplication {

	private static final Logger log = LoggerFactory.getLogger(CodeChallengeApplication.class);

	public static void main(String args[]) {
		SpringApplication.run(CodeChallengeApplication.class, args);
		/*
		String result =
				RestTemplate.getForObject(
						"http://example.com/hotels/{hotel}/bookings/{booking}",
						String.class,"42", "21"
				);
		*/
	}
}
