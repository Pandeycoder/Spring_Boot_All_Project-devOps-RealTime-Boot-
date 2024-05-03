package com.coder.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppException {

	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ExInfo> handleEx(Exception e) {

		ExInfo info=new ExInfo("Ex001",e.getMessage(),LocalDate.now());
		
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<ExInfo> handleProduct(ProductNotFoundException e) {

		ExInfo info=new ExInfo("Ex002",e.getMessage(),LocalDate.now());
		
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}
}
