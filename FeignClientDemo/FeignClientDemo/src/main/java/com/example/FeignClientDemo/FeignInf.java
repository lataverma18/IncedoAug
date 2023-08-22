package com.example.FeignClientDemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ms",url ="http://localhost:8087")
public interface FeignInf {
	@GetMapping("/home")
	String callHome();
	@GetMapping("/greet")
	String callGreet(); 
}
