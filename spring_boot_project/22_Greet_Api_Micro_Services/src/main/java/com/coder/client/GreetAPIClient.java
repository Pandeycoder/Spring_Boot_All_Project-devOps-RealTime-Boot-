package com.coder.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="WELCOME-API")
public interface GreetAPIClient {

	@GetMapping("/welcome")
	public String invokeWelcomeApi();
}

