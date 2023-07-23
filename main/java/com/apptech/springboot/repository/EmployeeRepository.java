package com.apptech.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apptech.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	

}
