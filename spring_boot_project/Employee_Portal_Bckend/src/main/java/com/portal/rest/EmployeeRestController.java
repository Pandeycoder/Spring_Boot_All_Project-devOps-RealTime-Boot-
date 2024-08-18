package com.portal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.service.EmployeeService;

import entities.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	    @Autowired
	    private EmployeeService employeeService;

	    @GetMapping("/{id}")
	    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
	        return ResponseEntity.ok(employeeService.getEmployeeById(id));
	    }

	    @PostMapping
	    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
	        return ResponseEntity.ok(employeeService.createEmployee(employee));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
	        return ResponseEntity.ok(employeeService.updateEmployee(id, employee));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	        return ResponseEntity.ok().build();
	    }

	    // Other employee specific endpoints
	
//	@PostMapping(value = "/employee", produces = { "application/xml", "application/json" })
//	public ResponseEntity<String> createAccount() {
//
//		
//			return new ResponseEntity<>("Account Creation Failed", HttpStatus.INTERNAL_SERVER_ERROR);// 500
//	}
//
//	@GetMapping(value = "/employee/{empId}", produces = { "application/xml", "application/json" })
//	public String getUser(@PathVariable("empId") Integer empId) {
//
//		return "";
//		
//	}
//
//	@PutMapping(value = "/employee/{empId}/{status}", consumes = { "application/xml", "application/json" }, produces = {
//			"application/json", "application/xml" })
//	public String updateUserAcc(@PathVariable("empId") Integer id) {
//		
//		 return "";
//	}
	    
	    
}
