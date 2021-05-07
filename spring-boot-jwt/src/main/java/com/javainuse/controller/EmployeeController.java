package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.javainuse.service.EmployeeService;

@RestController
@CrossOrigin()
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping({ "/hello" })
	public ResponseEntity<?> hello() {
		return ResponseEntity.ok("Hello World");
	}

	@PostMapping({ "/addemployee" })
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.createOrUpdateEmployee(employee));
	}

	@PutMapping({ "/updateemployee" })
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.createOrUpdateEmployee(employee));
	}

	@DeleteMapping({ "/deleteemployee" })
	public ResponseEntity<?> deleteEmployee(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.deleteEmployee(employee));
	}
	
	@GetMapping({ "/getallemployee" })
	public ResponseEntity<?> getAllEmployee() {
		return ResponseEntity.ok(employeeService.getAllEmployee());
	}

}
