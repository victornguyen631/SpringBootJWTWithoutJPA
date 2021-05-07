package com.javainuse.service;

import java.util.Map;

import com.javainuse.model.Employee;

public interface EmployeeService {

	Employee createOrUpdateEmployee(Employee employee);

	Employee deleteEmployee(Employee employee);

	Employee getEmployee(int id);

	Map<Integer, Employee> getAllEmployee();

}
