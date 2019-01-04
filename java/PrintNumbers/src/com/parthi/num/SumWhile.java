package com.parthi.num;

public class SumWhile {
int i=0,sum=0;
	
	public void print()
	{
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("sum="+sum);
	}
}
