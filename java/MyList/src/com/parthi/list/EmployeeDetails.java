package com.parthi.list;

public class EmployeeDetails
{
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public EmployeeDetails(int employeeId, String employeeName, double salary)
	{

    	this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ "]";
	}
	
	
	
	

}
