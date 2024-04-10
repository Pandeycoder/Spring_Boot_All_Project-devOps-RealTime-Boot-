package com.pandey.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mess_Rest {
	
	Logger logger=LoggerFactory.getLogger(Mess_Rest.class);
			
			
	@GetMapping("/welcome")
	public String getWelcomeMesg()
	{
		logger.trace("this is log trace mesg");
		logger.debug("this is log debug mesg");
		logger.info("this is log info msg");
		logger.warn("this is log warn msg");
		logger.error("this is log error msg");
		
		
		String msg="Welcome to our technology";
		return msg;
	}
	
	@GetMapping("/Greet")
	public String getGreetMesg()
	{
		String msg1="good morning";
		return msg1;
	}
	 

}
