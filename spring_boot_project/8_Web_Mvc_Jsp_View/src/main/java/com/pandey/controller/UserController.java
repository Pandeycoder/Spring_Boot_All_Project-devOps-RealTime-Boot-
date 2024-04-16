package com.pandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@GetMapping("/login")
	public String login(HttpServletRequest req, Model model)
	// even model it is send to data controller to UI
	{
		String name = req.getParameter("name");
		System.out.println("Name : " + name);
		

		HttpSession session = req.getSession();
		session.setAttribute("name", name);

		model.addAttribute("msg", name+"user logged in (session created)");

		return "index";
	}
	
	
	@GetMapping("/dashboard")
	public String dashboard(HttpServletRequest req, Model model)
	{
		HttpSession session = req.getSession();
		String name=(String) session.getAttribute("name");

		model.addAttribute("msg", name+" Welcome to our website.....");

		return "index";
	}
	
	
	

	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model)
	// even model it is send to data controller to UI
	{

		HttpSession session = req.getSession();
		
		session.invalidate();
		
		model.addAttribute("msg", "User logged out sucessfully..!");
		

		return "index";
	}

}
