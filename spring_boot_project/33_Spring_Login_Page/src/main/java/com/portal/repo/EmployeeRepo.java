package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
