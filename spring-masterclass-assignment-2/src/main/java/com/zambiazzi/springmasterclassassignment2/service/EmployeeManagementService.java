package com.zambiazzi.springmasterclassassignment2.service;

import java.util.List;

import com.zambiazzi.springmasterclassassignment2.model.Employee;

public interface EmployeeManagementService {
	public Employee addNewEmployee(Employee employee);

	public Employee searchEmployee(long employeeId);

	public void deleteEmployee(long employeeId);

	public List<Employee> findAllEmployees();

	public Employee updateEmployee(Employee employee);
}
