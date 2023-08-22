package com.example.EurekaClient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSController {

	@GetMapping("/greet")
	public String greet()
	{
		return "Hello";	
	}
	@GetMapping("/home")
	public String home()
	{
		return "Home";	
	}
}
