package com.parthi.employeesalary;

import java.util.Scanner;

public class Labour extends Employee
{

	double overTime;

    Scanner s= new Scanner(System.in);
	
    public void labour()
    {
    	System.out.println("enter employee details \n");
    	
    	System.out.println("name:");
    	employeeName=s.nextLine();
    	
    	System.out.println("employee id:");
    	employeeId=s.nextInt();
    	
    	System.out.println("salary:");
    	salary=s.nextDouble();
    	
    	System.out.println("overtime amount:");
    	overTime=s.nextDouble();
    	
        totalSalary(overTime);
    
    }
}
