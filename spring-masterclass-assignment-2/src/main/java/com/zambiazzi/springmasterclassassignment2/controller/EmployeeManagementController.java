package com.zambiazzi.springmasterclassassignment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zambiazzi.springmasterclassassignment2.model.Employee;
import com.zambiazzi.springmasterclassassignment2.service.EmployeeManagementService;

@Controller
public class EmployeeManagementController {

	@Autowired
	EmployeeManagementService employeeManagementservice;

	public Employee addNewEmployee(Employee employee) {
		return employeeManagementservice.addNewEmployee(employee);
	}

	public Employee searchEmployee(long employeeId) {
		return employeeManagementservice.searchEmployee(employeeId);
	}

	public void deleteEmployee(long employeeId) {
		employeeManagementservice.deleteEmployee(employeeId);
	}

	public List<Employee> findAllEmployees() {
		return employeeManagementservice.findAllEmployees();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeManagementservice.updateEmployee(employee);
	}
}
