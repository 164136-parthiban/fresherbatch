package com.parthi.armstrong;

public class ArmstrongNumber {
	
	
	
	
	/*ArmstrongNumber(int num)
	{
		this.num=num;
	}*/
	
	public void validate(int num)
	{   
		
		int temp=num;
		int rem,result=0;
		
		while(temp>0)
		{
			 rem=temp%10;
		     temp=temp/10;
		     result=result+(rem*rem*rem);
		 }
		
		if(num==result)
		
		{
			
			System.out.println(num+" its a Armstrong number");
		    
		}
		
		
	}
}
