package com.springboot.emloyee.webapp.employeeWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.emloyee.webapp.employeeWebApp.dao.EmployeeDAO;
import com.springboot.emloyee.webapp.employeeWebApp.entity.Employee;

@Service
public class EmloyeeServiceImp implements EmployeeService  {
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmloyeeServiceImp( EmployeeDAO theEmployeeDAO){
		employeeDAO = theEmployeeDAO; 
	} 

	@Override
	@Transactional
	public List<Employee> findAll() {
		
		
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		
		employeeDAO.deleteById(theId);
	}

	
	
}
