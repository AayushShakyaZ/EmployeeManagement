package com.apptech.springboot.controller;

//import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class IndexController {
	//@RequestMapping (value ="/", method = RequestMethod.GET)
	@GetMapping("/")
	public String indexPage() {
		
		return "index";
		
		
	}
	
	

}
