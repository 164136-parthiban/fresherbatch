package com.parthi.armstrong;

public class PrintArmstrongNumbers 
{
	public static void main(String[] args)
	{
		
		int num =0;
		
        ArmstrongNumber arm= new ArmstrongNumber();
        
        for(num=100;num<999;num++)
        {
          arm.validate(num);
	    }
        
	}
}
