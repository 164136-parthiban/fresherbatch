package com.parthi.arms;

public class ArmstrongNumbers
{
	
	public void print()
	{   
		int num,temp;
		int rem,result=0;
	
		for(num=100;num<=999;num++)
		{
			temp=num;
			
	    while(temp>0)
		{
			 rem=temp%10;
		     temp=temp/10;
		     result=result+(rem*rem*rem);
		 }
		
		if(num==result)
		
			System.out.println(num);
		
		}
	}

}
