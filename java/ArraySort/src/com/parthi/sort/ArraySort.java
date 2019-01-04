package com.parthi.sort;

public class ArraySort {

	int[] array= {5,12,14,6,78,19,123,26,35,37,7,52,86,47};
	int i,temp;
	public void sort() {
		
		System.out.println("before sorting");
		
		for(i=0;i<15;i++)
		{
			System.out.println(array[i]);
		}
		
		
		for(i=0;i<14;i++)
		{
			if(array[i]>array[i+1])
			{
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		
        System.out.println("after sorting");
		
		for(i=0;i<15;i++)
		{
			System.out.println(array[i]);
		}
	}
}
