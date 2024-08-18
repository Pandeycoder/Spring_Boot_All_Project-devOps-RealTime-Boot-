package com.portal.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrAdminRestController {


	@GetMapping(value="/hr")
	public String hr()
	{
		return "<h1 style='background-color:blue; color:white'>Welcome Hr Protal dashboard<h1>";
	}
}
