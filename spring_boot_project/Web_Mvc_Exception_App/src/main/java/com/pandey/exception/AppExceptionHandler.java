package com.pandey.exception;

import java.time.LocalDateTime;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	

	@ExceptionHandler(value=Exception.class)
	public String handler(Exception ex , Model model)
	{
		
		System.out.println("exception class started....");
		
		model.addAttribute("res",ex.getMessage());
		model.addAttribute("date", LocalDateTime.now());
		return "error";
	}
}
