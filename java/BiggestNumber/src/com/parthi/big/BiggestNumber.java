package com.parthi.big;

public class BiggestNumber 
{
	int i,length;
	
	BiggestNumber(int num)
	{
		length=num;
	}
		
	public void big(int[] array)
	{ 
		int max=0;
        int temp;
		
		for(int i=0;i< array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		for(int i=0;i< array.length-1;i++)
		{
			if(array[i]<array[i+1])
			{
				max=array[i+1];
			}
		
		}
		System.out.println("the biggest number is "+max);
		
	}
	
	

}
