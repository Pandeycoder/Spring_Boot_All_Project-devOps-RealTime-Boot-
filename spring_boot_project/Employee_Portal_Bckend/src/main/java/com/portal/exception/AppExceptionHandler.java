package com.portal.exception;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

		private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

		@ExceptionHandler(value = Exception.class)
		public ResponseEntity<AppExceptions> handleException(String exMsg) {

			logger.error("Exception Occured : " + exMsg);

			AppExceptions ex = new AppExceptions();
			ex.setExCode("EX0003");
			ex.setExDesc(exMsg);
			ex.setExDate(LocalDateTime.now());

			return new ResponseEntity<AppExceptions>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}