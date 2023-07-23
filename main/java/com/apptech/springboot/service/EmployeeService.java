package com.apptech.springboot.service;

import java.util.List;

import com.apptech.springboot.model.Employee;

public interface EmployeeService {
	
	Long addEmployee(Employee employee);
	void deleteEmployee(Long id);
	void updateEmployee(Employee employee);
	Employee getEmployeebById(Long Id);
	
	List<Employee> getAllEmployee();
	
	

}
