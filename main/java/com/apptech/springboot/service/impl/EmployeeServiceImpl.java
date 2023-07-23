package com.apptech.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apptech.springboot.model.Employee;
import com.apptech.springboot.repository.EmployeeRepository;
import com.apptech.springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Long addEmployee(Employee employee) {
		
		return employeeRepo.save(employee).getId();
				
	}

	@Override
	public void deleteEmployee(Long id) {
	
		employeeRepo.deleteById(id);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepo.save(employee);
		
		
	}

	@Override
	public Employee getEmployeebById(Long Id) {
		
		return employeeRepo.getById(Id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepo.findAll();
	}
	
	

	

}
