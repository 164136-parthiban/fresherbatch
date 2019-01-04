package com.parthi.datastructures;

import java.util.Scanner;

public class MyArrayList implements MyList 
{

	int array[]=new int[100];
	int length;
	
	Scanner s = new Scanner(System.in);
	
	@Override
	public void add()
	{
      		
      		System.out.println("enter array length \n");
      		length=s.nextInt();
      		System.out.println("enter array elements \n");
      		   		
      		for(int i=0;i<length;i++)
      		{
      			array[i]=s.nextInt();
      		}
		    
	}

	@Override
	public void search(int number) 
	{
		int temp=number;
		int flag=0;
	
		for(int i=0;i<length;i++)
  		{
  			if(array[i]==temp)
  			{
  				System.out.println(number+" is found in the array list ");
  				flag=1;
  			}
  			
  		}
		
		if(flag==0)
			{
				System.out.println(number+" is not found in the array list \n");
			}
	}

	@Override
	public void sort()
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
			
			System.out.println("after sorting \n");
			
			for(int i=0;i<length;i++)
			{
				System.out.println(array[i]);
			}	
  		
	}

	@Override
	public void update(int number1,int position)
	{
	
		
		for(int i=length;i>position;i--)
		{	
			array[i+1]=array[i];			
		}
		array[position]=number1;
		
		System.out.println("after updation \n");
		
		for(int i=0;i<length;i++)
		{
			System.out.println(array[i]);
		}	
		
	}

	@Override
	public void remove(int number2) 
	{
       
		int temp=number2;
        int flag=0;
		
		for(int i=0;i<length;i++)
  		{
  			if(array[i]==temp)
  			{
  			  temp=i;
  			  flag=1;
              break;              
  			}
  		}
		
		if(flag==1)
		{
		for(int i= temp;i<length;i++)
	     	{
			 array[i]=array[i+1];
	     	}
		length=length-1;
		
		System.out.println("after removing "+number2+" the array list \n");
		
		 for(int i=0;i<length;i++)
  		  { 
			System.out.println(array[i]);
  	      }
		}
		else
		{
			System.out.println(number2+" is not found in the array list ");
		}
		
	}

}
