package com.javainuse.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private Map<Integer,Employee> employees = new HashMap<Integer,Employee>();

	@Override
	public Employee createOrUpdateEmployee(Employee employee) {
		if (employees.get(employee.getId()) == null) {
			employees.put(employee.getId(), employee);
			return employee;
		} else {
			employees.get(employee.getId()).setDepartment(employee.getDepartment());
			return employee;
		}
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		if (employees.get(employee.getId()) != null) {
			employees.remove(employee.getId());
			return employee;
		} else {
			return null;
		}
		
	}

	@Override
	public Employee getEmployee(int id) {
		return employees.get(id);
	}

	@Override
	public Map<Integer,Employee> getAllEmployee() {
		return employees;
	}

}
