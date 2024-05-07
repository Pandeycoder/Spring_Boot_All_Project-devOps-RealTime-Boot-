package com.coder.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String getWelc()
	{
		String port=env.getProperty("server.port");
		
		
		String msg="Welcome to our page....! (Server Port :: "+port + ")";
		
		return msg;
	}
}
