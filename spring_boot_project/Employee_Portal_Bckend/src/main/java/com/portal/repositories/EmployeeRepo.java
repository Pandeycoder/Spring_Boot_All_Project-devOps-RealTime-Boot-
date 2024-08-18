package com.portal.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import entities.Employee;
@EnableJpaRepositories 
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // Custom query methods can be added here if needed
}
