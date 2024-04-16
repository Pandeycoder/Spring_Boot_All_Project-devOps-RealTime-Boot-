package com.pandey.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pandey.binding.Book;
import com.pandey.binding.Product;

@RestController
public class productController {
	
	
	@GetMapping("/product")  //Query parameter
	public Product getProduct(@RequestParam("pid") Integer pid)
	{
		Product p=new Product(pid,"Mouse",500.23);
	
		return p;
	}
	
	

}
