package com.parthi.EmployeeManagementSystem.services;

import java.util.List;
import java.util.Map;

import com.parthi.EmployeeManagementSystem.model.Employee;

public interface EmployeeService
{

	public  List<Employee> get();
	public Employee getEmployee(long id);
	public List<Employee> addEmployee(Employee E);
	public List<Employee> deleteEmployee(long id);
	public Employee updateEmployee(long id,Employee E);
	
	
	
}
