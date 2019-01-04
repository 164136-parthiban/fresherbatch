package com.parthi.sort;

public class Sorting {
	
	int length;
	
	Sorting(int num)
	{
		length=num;
	}
	
	void ascendingOrder(int[] array)
	{
         int temp;
		
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		
		System.out.println("after sorting in ascending order");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}	
	}
	
	void descendingOrder(int[] array)
	{
         int temp;
		
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]<array[i+1])
			{
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		
		System.out.println("after sorting in descending order");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}	
	}

}
