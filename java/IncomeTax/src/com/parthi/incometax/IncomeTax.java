package com.parthi.incometax;

public class IncomeTax 
{
  double tax;
  private double salary;
  
public IncomeTax(double salary)
{
this.salary=salary;
}

	
	public void calculateTax()
	{
		tax=salary-180000;
		if(tax<=0)
		{
			System.out.println("tax is nill");
		}
		
		else if((tax>0)&&(tax<300000))
		{
			tax=tax*0.1;
			System.out.println("tax to be paid is "+tax);
		}
		
		else if((tax>300000)&&(tax<500000))
		{
			tax=30000+(0.2*tax);
			System.out.println("tax to be paid is "+tax);	
		}
		
		else if((tax>500000)&&(tax<1000000))
		{
			tax=70000+(0.3*tax);
			System.out.println("tax to be paid is "+tax);	
		}
			
	}
	
	
	
	
}
