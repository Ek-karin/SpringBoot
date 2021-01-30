package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.entities.*;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		return  employeeRepository.findAll();
	}
	
	public Employee getSomeEmployee(int id) {
		return employeeRepository.getOne(id);
	}

}
