package com.zambiazzi.springmasterclassassignment2.repository;

import java.util.List;

import com.zambiazzi.springmasterclassassignment2.model.Employee;

public interface EmployeeManagementRepository {

	Employee createEmployee(Employee employee);

	Employee findEmployee(long employeeId);

	List<Employee> findAllEmployees();

	Employee updateEmployee(Employee employee);

	void deleteEmployee(long employeeId);
}