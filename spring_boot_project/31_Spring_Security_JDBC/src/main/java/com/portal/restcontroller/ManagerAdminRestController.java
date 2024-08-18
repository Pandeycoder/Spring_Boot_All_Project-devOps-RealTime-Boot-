package com.portal.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerAdminRestController {

	@GetMapping(value="/manager")
	public String manager()
	{
		return "<h1 style='background-color:orange; color:black'>Welcome manager Protal dashboard<h1>";
	}
}
