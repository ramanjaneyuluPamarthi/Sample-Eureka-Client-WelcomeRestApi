package com.nit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome To ....";
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "How do you do...";
	}
}
