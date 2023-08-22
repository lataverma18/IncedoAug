package com.example.springsecuritydemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	@GetMapping("/casual")
	public String casualPath()
	{
		return "Casual Endpoint accessible to All";
	}
	@GetMapping("/secured")
	public String securedPath()
	{
		return "Secured Endpoint is restricted!!!";
	}
}
