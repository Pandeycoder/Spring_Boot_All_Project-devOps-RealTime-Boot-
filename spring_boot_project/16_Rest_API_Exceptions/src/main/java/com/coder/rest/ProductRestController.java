package com.coder.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coder.exception.ProductNotFoundException;

@RestController
public class ProductRestController {

	@GetMapping("/product/{pid}")
	public String getProductInfo(@PathVariable Integer pid)
	{
		
		if(pid > 100)
		{
			//throw Exception
			throw new ProductNotFoundException("InValid Product ID");
		}
		
		return "Keyboard - 2500 INR";
		
		
	}
}
