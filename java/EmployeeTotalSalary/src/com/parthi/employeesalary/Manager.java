package com.parthi.employeesalary;

import java.util.Scanner;

public class Manager extends Employee
{
 
    Scanner s= new Scanner(System.in);
	
    public void manager()
    {
    	double incentive;
    	
    	System.out.println("enter employee details \n");
    	
    	System.out.println("name:");
    	employeeName=s.nextLine();
    	
    	System.out.println("employee id:");
    	employeeId=s.nextInt();
    	
    	System.out.println("salary:");
    	salary=s.nextDouble();
    	
    	System.out.println("incentive:");
    	incentive=s.nextDouble();
    	
    	totalSalary(incentive);
   
    
    }
       

}