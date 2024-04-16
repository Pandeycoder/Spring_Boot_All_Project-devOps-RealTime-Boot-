package com.pandey.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesgController {
	
	@GetMapping("/welcome")
	public String getWel()
	{
		return "Welcome to our page....!";
	}
	
	
	@GetMapping("/greet")
	public String getGreet()
	{
		return "good morning....!";
	}
	

}
