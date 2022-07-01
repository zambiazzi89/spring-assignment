package com.zambiazzi.springmasterclassassignment2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zambiazzi.springmasterclassassignment2.controller.EmployeeManagementController;
import com.zambiazzi.springmasterclassassignment2.model.Employee;

@SpringBootTest
class SpringMasterclassAssignment2ApplicationTests {

	@Autowired
	EmployeeManagementController employeeManagementController;

	Employee newEmployee = new Employee("Jane Doe", "Dep1", "Design", 56000);

	@Test
	void contextLoads() {
		employeeManagementController.addNewEmployee(newEmployee);
		assertEquals("John Doe", employeeManagementController.searchEmployee(10002).getEmployeeName());
		assertEquals(3, employeeManagementController.findAllEmployees().size());
		employeeManagementController.deleteEmployee(10002);
		assertEquals(2, employeeManagementController.findAllEmployees().size());
	}

}
