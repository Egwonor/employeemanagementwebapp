package com.springboot.emloyee.webapp.employeeWebApp.dao;

import java.util.List;

import com.springboot.emloyee.webapp.employeeWebApp.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save (Employee theEmployee);
	
	public void deleteById (int theId);
	
}
