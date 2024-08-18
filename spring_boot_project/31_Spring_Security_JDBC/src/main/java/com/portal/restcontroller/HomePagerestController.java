package com.portal.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePagerestController {

	
	@GetMapping(value="/")
	public String welcome()
	{
		return "<h3 style='background-color:yellow; color:red'>Welcome home page of website :)</h3>";
	}
}
