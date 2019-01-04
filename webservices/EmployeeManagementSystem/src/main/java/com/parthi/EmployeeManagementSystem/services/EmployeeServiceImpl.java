package com.parthi.EmployeeManagementSystem.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.glassfish.jersey.internal.guava.Iterators;

import com.parthi.EmployeeManagementSystem.model.Employee;
import com.parthi.EmployeeManagementSystem.repository.EmployeeRepository;

public  class EmployeeServiceImpl implements EmployeeService {
	
	private Map<Long, Employee> emp = EmployeeRepository.getList();
	
	
	
	public EmployeeServiceImpl() 
	{
		emp.put(1L,new Employee(1L, "parthi", "java", "developer", 60000));
		emp.put(2L, new Employee(2L, "roshan", "java", "tester", 40000));

	}


	@Override
	public List<Employee> get()
	{
		return new ArrayList<Employee>(emp.values());
	}


	@Override
	public Employee getEmployee(long id) 
	{
		
		return emp.get(id);
	}

	@Override
	public List<Employee> addEmployee(Employee e)
	{
		e.setEmployeeId(emp.size()+1);
		emp.put(e.getEmployeeId(), e);
		
		return new ArrayList<Employee>(emp.values());
	}

	@Override
	public  List<Employee> deleteEmployee(long id)
	{
		
		 emp.remove(id) ;
		 return new ArrayList<Employee>(emp.values());
	}

	@Override
	public Employee updateEmployee(long id,Employee e)
	{
		if(e.getEmployeeId()==id)
		{
			emp.put(e.getEmployeeId(), e);
		return e;
		}
		
		return null;
	}

}
