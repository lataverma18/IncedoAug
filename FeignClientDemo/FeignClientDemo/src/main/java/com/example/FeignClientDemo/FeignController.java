package com.example.FeignClientDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
	@Autowired
	FeignInf fi;
	
	@GetMapping("/fetchHome")
	public String fetchingHomeEndpoint()
	{
		return fi.callHome();
	}
	@GetMapping("/fetchGreet")
	public String fetchingGreetEndpoint()
	{
		return fi.callGreet();
	}
}
