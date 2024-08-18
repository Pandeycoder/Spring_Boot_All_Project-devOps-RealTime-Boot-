package com.portal.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@GetMapping(value = "/user")
	public String employee() {
		return "<h2 style='background-color:green; color:white'>Welcome to employee dashboard<h2>";
	}
}
