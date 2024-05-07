package com.coder.restcontroller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder.exception.ExInfo;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		int i=10/0;
		
		return "<h1>Welcome to Our page</h1>";
	}
	
//	@ExceptionHandler(value=Exception.class)
//	public ResponseEntity<ExInfo> handleEx(Exception e)
//	{
//		
//		ExInfo info=new ExInfo("Ex001", e.getMessage(), LocalDate.now());
//		
//		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}
