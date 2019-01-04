package com.parthi.small;

public class SmallestNumber 
{
  int i,length;
	
	SmallestNumber(int num)
	{
		length=num;
	}
		
	public void small(int[] array)
	{ 
		int min=0;
        int temp;
		
		for(int i=0;i< array.length-1;i++)
		{
			if(array[i]<array[i+1])
			{
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		for(int i=0;i< array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				min=array[i+1];
			}
		
		}
		System.out.println("the smallest number is "+min);
		
	}
	
	
	

}

