package com.cal.calservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalService {
	
	@GetMapping("cal/{service}/{a}/{b}")
	int calOperation(@PathVariable("a") int a,@PathVariable("b") int b,@PathVariable("service") String service)
	{
		if(service.equals("add"))
		{
			return a+b;
		}
		if(service.equals("sub"))
		{
			return a-b;
		}
		if(service.equals("mul"))
		{
			return a*b;
		}
		if(service.equals("div"))
		{
			return a/b;
		}
		return 0;
	}
}
	