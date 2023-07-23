package com.apptech.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apptech.springboot.model.Employee;
import com.apptech.springboot.service.EmployeeService;

@Controller

public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	public String getForm() {
		
		return "employeeForm";
		
	}
	
	@PostMapping("/employee")
	public String saveEmpData(@ModelAttribute Employee employee) {
		
		
		service.addEmployee(employee);
		
		
		return "EmployeeForm";
		
	}
	@GetMapping("/list")
	public String getEmployees(Model model) {
		
		model.addAttribute("elist",service.getAllEmployee());
		
		return "EmployeeData";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam Long id) {
		service.deleteEmployee(id);
		
		return "redirect:list";
	}
	
	
	@GetMapping("/edit")
	public String edit(@RequestParam Long id, Model model) {
		
		model.addAttribute("emodel", service.getEmployeebById(id));
		
		return "editForm";
	}
	
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee emp) {
		
		service.updateEmployee(emp); 
		
		return "redirect:list";
		
		
	}

}
