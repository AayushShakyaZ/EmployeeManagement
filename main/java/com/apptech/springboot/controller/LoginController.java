package com.apptech.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apptech.springboot.model.User;
import com.apptech.springboot.repository.UserRepository;

@Controller

@RequestMapping("/user")

public class LoginController {
	@Autowired
	private UserRepository userRepo;

	@GetMapping("/login")
	public String showForm() {
		return "Loginform";

	}

	@PostMapping("/login")
	public String Login(@ModelAttribute User user, Model model) {

		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		//shakyaji
		//pass123
		// User usr = userRepo.findByUserNameAndPassword(user.getUsername(),
		// user.getPassword());
		User usr = userRepo.userLogin(user.getUsername(), user.getPassword());
		System.out.println(usr.toString());

		if (usr != null) {
			//model.addAttribute("uname", user.getUsername());
			model.addAttribute("dinesh", usr.getUsername());

			return "home";
		}
		model.addAttribute("message", "user not found");

		return "Loginform";

	}

}
