package com.parthi.EmployeeManagementSystem.repository;
import com.parthi.EmployeeManagementSystem.model.Employee;

import java.util.HashMap;

import java.util.Map;

import javax.enterprise.inject.New;


public class EmployeeRepository
{
	static Map<Long, Employee> list = new HashMap<Long, Employee>();

	public static Map<Long, Employee> getList()
	{
		return list;
	}
	
	
}
