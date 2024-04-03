package com.example.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	@Value("${my.greeting: default value}")
	private String greetingMessage;
	
	
	@GetMapping("/greet")
	public String greet() {
		return "my.greeting: " + greetingMessage;
	}
}
