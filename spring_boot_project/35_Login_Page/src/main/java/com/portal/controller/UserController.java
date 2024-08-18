package com.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.portal.model.User;
import com.portal.service.UserService;

@Controller
public class UserController {
	    @Autowired
	    private UserService userService;

	    @GetMapping("/")
	    public String home() {
	        return "home";
	    }

	    @GetMapping("/register")
	    public String register(Model model) {
	        model.addAttribute("user", new User());
	        return "register";
	    }

	    @PostMapping("/register")
	    public String registerUser(User user, @RequestParam String role) {
	        user.setRole(role);
	        userService.saveUser(user);
	        return "redirect:/login";
	    }

	    @GetMapping("/login")
	    public String login() {
	        return "login";
	    }

	    @GetMapping("/superAdmin")
	    public String superAdmin() {
	        return "superAdmin";
	    }

	    @GetMapping("/hr")
	    public String hr() {
	        return "hr";
	    }

	    @GetMapping("/manager")
	    public String manager() {
	        return "manager";
	    }

	    @GetMapping("/user")
	    public String user() {
	        return "user";
	    }
	}

