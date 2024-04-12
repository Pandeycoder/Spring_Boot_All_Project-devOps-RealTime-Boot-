package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v2")
public class LoginController {

	

	@GetMapping("/dashboard1")
	public String test1(@RequestParam("id") Integer id, Model model) {

		System.out.println(id);
		model.addAttribute("msg", "Dashboard under contruction...");

		return "index";

	}
	

	@GetMapping("/login1")
	public String test2(Model model) {

		model.addAttribute("msg", "this is login method");

		
		
	//	return "redirect:/dashboard?id=101";
		return "forward:/dashboard1?id=101";


	}
	
}
