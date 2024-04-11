package com.wetie.spring.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGithubActionsApplication {

	@GetMapping("/message")
	public String Message() {
		return "I am testing Github-actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGithubActionsApplication.class, args);
	}

}
