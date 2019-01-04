package com.parthi.employeesalary;

public class Employee 
{

	int employeeId;
	String employeeName;
	 double salary;
    
	
	public void totalSalary(double amount)
	{
		double totalAmount=salary+amount;
		System.out.println("employee name :"+employeeName);
		System.out.println("employee id :"+employeeId);
		System.out.println("total salary obtained by employee is "+totalAmount);		
	}
	
}

