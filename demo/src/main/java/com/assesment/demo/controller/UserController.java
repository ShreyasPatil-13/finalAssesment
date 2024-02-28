package com.assesment.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assesment.demo.model.User;
import com.assesment.demo.services.UserService;


@Controller
public class UserController {

	UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("user", new User());
		return "home";
	}
	
	@GetMapping("/display")
	public String display(Model model) {
		model.addAttribute("users", userService.getUsers());
		return "display";
	}
	
	@PostMapping("/saveuser")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/display";
	}
	
	
}
