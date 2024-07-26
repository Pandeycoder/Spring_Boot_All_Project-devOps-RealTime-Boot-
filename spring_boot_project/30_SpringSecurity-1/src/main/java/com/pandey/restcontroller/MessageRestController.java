package com.pandey.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	@GetMapping("/welcome")
	public String msg()
	{
		return "Hello welcome to our page";
	}
	
	@GetMapping("/greet")
	public String greet()
	{
		return "good morning";
	}
	
}
