package com.coder.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder.client.GreetAPIClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private GreetAPIClient apiClient;
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		String greetResponse="A very good morning.....!";
	
		String welcomeResponse=apiClient.invokeWelcomeApi();
		
		return greetResponse+" , "+welcomeResponse;
	}

}
