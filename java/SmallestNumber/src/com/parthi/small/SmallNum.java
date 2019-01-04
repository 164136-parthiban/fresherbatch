package com.parthi.small;

import java.util.Scanner;

public class SmallNum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   
		Scanner s = new Scanner(System.in);
		
        
		
		System.out.println("enter the array length");
		int length=s.nextInt();
		
		SmallestNumber num = new SmallestNumber(length);
		
        int array[]=new int[length];
		
		System.out.println("enter array elements");
		
		for(int i=0;i<length;i++)
		{
		 array[i]=s.nextInt();
		}
		
		num.small(array);
	}


	}


