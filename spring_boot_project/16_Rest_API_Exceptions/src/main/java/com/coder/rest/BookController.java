package com.coder.rest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class BookController {

	@GetMapping("/book")
	public String getBookName()
	{
		
		String msg=null;
		
		msg.length();
		
		return "Java";
	}
	
	
}
