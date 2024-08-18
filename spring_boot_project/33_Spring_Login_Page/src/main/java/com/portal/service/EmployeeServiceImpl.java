package com.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.model.Employee;
import com.portal.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Employee newEmployee(Employee emp) {
		
		
		
		return empRepo.save(emp);
	}

}
