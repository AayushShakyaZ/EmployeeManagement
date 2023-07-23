package com.apptech.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.apptech.springboot.model.User;
import com.apptech.springboot.repository.UserRepository;

@Controller
public class signupcontroller {
	@Autowired
	private UserRepository userRepo;
	
	
	@GetMapping("/signup")
	public String showForm() {
		
		return "signup";
	}
	
	@PostMapping("/signup")
	public String saveUser(@ModelAttribute User user) {

		userRepo.save(user);
		return "Loginform";
	}

}
