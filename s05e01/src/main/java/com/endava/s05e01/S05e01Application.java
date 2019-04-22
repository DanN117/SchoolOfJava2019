package com.endava.s05e01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class S05e01Application {

	public static void main(String[] args) {
		SpringApplication.run(S05e01Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate
	}
}
