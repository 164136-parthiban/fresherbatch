package com.parthi.array;

public class ArraySearch {

int[] array= {5,12,14,6,78,19,123,26,35,37,7,52,86,47};
int i,num,count=0;
ArraySearch(int num) 
{
	this.num=num;
}

public void search()
{
	for(i=0;i<15;i++)
	{
		if(array[i]==num)
		{
	      System.out.println("element found");
		  count=1;
	    }
	}
	
	if(count==0)
	System.out.println("element not found");
}
}
