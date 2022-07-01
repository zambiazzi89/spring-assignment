package com.zambiazzi.springmasterclassassignment2.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.zambiazzi.springmasterclassassignment2.model.Employee;

@Repository
@Transactional
public class EmployeeManagementRepositoryImpl implements EmployeeManagementRepository {

	// Connect to the database
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Employee createEmployee(Employee employee) {
		return entityManager.merge(employee);
	}

	@Override
	public Employee findEmployee(long employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return entityManager.merge(employee);
	}

	@Override
	public void deleteEmployee(long employeeId) {
		Employee employee = findEmployee(employeeId);
		entityManager.remove(employee);
	}

}
