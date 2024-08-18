package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee/")
public class Employeecontroller {
	
	@GetMapping("/")
	public String dashBoard()
	{
		return "employee/employeeHome";
	}

}
