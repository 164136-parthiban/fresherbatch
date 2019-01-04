package com.parthi.employee;

import com.parthi.employee.Employee;

public class AbstractDemo 
{

	   public static void main(String [] args) 
	   {
	      Employee e =new Employee("George W.", "Houston TX", 43) 
	      {
		  };
	   
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	   }
	}