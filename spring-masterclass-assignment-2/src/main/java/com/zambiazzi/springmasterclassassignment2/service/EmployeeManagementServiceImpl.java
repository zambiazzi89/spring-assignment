package com.zambiazzi.springmasterclassassignment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zambiazzi.springmasterclassassignment2.model.Employee;
import com.zambiazzi.springmasterclassassignment2.repository.EmployeeManagementRepository;

@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

	@Autowired
	EmployeeManagementRepository employeeManagementRepository;

	@Override
	public Employee addNewEmployee(Employee employee) {
		return employeeManagementRepository.createEmployee(employee);
	}

	@Override
	public Employee searchEmployee(long employeeId) {
		return employeeManagementRepository.findEmployee(employeeId);
	}

	@Override
	public void deleteEmployee(long employeeId) {
		employeeManagementRepository.deleteEmployee(employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeManagementRepository.findAllEmployees();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeManagementRepository.updateEmployee(employee);
	}

}
