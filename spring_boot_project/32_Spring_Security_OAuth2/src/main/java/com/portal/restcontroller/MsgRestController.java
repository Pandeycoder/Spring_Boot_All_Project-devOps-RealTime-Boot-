package com.portal.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping(value="/")
	public String welcomeMsg()
	{
		return "<h1>Welcome to explorejoruney<h1>";
	}
} 
