package com.artemoleshev.spring.mvc_hibernate_aop.dao;

import java.util.List;

import com.artemoleshev.spring.mvc_hibernate_aop.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public void deleteEmployee(int id);
}
