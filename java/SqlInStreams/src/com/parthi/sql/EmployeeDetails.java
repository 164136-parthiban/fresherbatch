package com.parthi.sql;

public class EmployeeDetails
{
	int emp_id;
	String empname;
	int Deptno;
	String deptname;
	int salary;
	String position;
	
	public EmployeeDetails(int emp_id, String empname, int deptno, String deptname, int salary, String position)
	{
		
		this.emp_id = emp_id;
		this.empname = empname;
		Deptno = deptno;
		this.deptname = deptname;
		this.salary = salary;
		this.position = position;
		
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getDeptno() {
		return Deptno;
	}

	public void setDeptno(int deptno) {
		Deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
