package com.coder.restcontroller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestcontroller {
	
	
	@GetMapping("/")
	public String getMess(Model model)
	{
		return "Hello welcome our page...!";
	}

}
