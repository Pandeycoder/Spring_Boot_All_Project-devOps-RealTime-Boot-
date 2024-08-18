package com.portal.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperAdmin {

	@GetMapping(value="/superAdmin")
	public String superAdminProfile()
	{
		return "<h1 style='background-color:red; color:white'>welcome to super admin dashboard";
	}
}
