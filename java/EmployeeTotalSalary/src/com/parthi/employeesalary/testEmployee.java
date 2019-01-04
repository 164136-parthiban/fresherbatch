package com.parthi.employeesalary;

import java.util.Scanner;

public class testEmployee {

	public static void main(String[] args)
	{   
		int designation;
		
	    Scanner s = new Scanner(System.in);
	    
		System.out.println("enter employee designation as 1 for manager and 2 for labour");
		
		designation=s.nextInt();
		
		if(designation==1)
		{
			Manager mgr = new Manager();
			mgr.manager();
		}
		else
		{
			Labour lab= new Labour();
			lab.labour();
		}

	}

}
