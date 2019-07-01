package soj4.soj4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Soj4Application {

	public static void main(String[] args) {
		SpringApplication.run(Soj4Application.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
