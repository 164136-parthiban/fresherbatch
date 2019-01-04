package com.parthi.set;

public class Employee {
	String name;
	int id;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public  int hashCode() {
	
		return 100;
	}
	
	@Override
	public boolean equals(Object obj)
	{
			return true;
	
	}


}
