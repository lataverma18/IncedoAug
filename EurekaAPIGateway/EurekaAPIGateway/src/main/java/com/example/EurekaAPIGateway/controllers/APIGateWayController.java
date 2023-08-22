package com.example.EurekaAPIGateway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APIGateWayController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/fetchGreet")
	public ResponseEntity<String> fetchMSGreetMsg()
	{
		String str=rt.getForObject("http://ms/greet", String.class);
		ResponseEntity<String> re=rt.getForEntity("http://ms/greet", String.class);
		return re;
	}
}
