package com.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.portal.model.Employee;
import com.portal.service.EmployeeService;

@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/")
	public String homePage()
	{
	  return "index";	
	}
	
	@GetMapping("/login")
	public String loginPage()
	{
	  return "login";	
	}
	
	@GetMapping("/register")
	public String loadForm(Model model)
	{
		model.addAttribute("emp",new Employee());
		return "register";
	}
	
	
	@PostMapping("/save-user")
	public String registration(@ModelAttribute("emp") Employee emp,Model model)
	{
		System.out.println(emp);
		empService.newEmployee(emp);
		
		model.addAttribute("msg","Successfuly created ");
		
		return "register";
	}

}
