package com.parthi.set;

import java.util.Hashtable;

public class EmployeeDetails {

	public static void main(String[] args) 
	{
	Hashtable<Employee,Integer> hash=new Hashtable<>();
	
	Employee e1=new Employee(51,"Urvi");
	hash.put(e1,5000);
	
	Employee e2=new Employee(25,"parthi");
	hash.put(e2, 55000);
	
	Employee e3=new Employee(25,"roshan");
	hash.put(e3, 55000);
	
	Employee e4=new Employee(26,"Shweta");
	hash.put(e4,60000);	
	
	System.out.println(e3.name+" "+e2.hashCode());
	
	System.out.println(e2.name+" "+e3.hashCode());
	
	System.out.println(e1.name+" "+e1.hashCode());
	
	System.out.println(e4.name+" "+e4.hashCode());
	
	
	}

}

