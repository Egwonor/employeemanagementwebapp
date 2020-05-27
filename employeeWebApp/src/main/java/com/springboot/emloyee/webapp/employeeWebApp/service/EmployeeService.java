package com.springboot.emloyee.webapp.employeeWebApp.service;

import java.util.List;

import com.springboot.emloyee.webapp.employeeWebApp.entity.Employee;

public interface EmployeeService {

    public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save (Employee theEmployee);
	
	public void deleteById (int theId);
	
}
