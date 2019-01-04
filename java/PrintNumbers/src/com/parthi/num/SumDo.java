package com.parthi.num;

public class SumDo {
int i=0,sum=0;
	
	public void print()
	{
		do
		{
			sum=sum+i;
			i++;
		}while(i<=10);
		System.out.println("sum="+sum);
	}

}
