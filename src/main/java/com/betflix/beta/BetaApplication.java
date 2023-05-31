package com.betflix.beta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaApplication.class, args);
	}

	@GetMapping("/profile")
	public Profile profile() {
		return new Profile("kid", 15, 1);
	}

}
