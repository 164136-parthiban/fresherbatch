package com.parthi.big;

import java.util.Scanner;

public class BigNum
{   
	
	
	public static void main(String[] args) 
	{  
		Scanner s = new Scanner(System.in);
		
        
		
		System.out.println("enter the array length");
		int length=s.nextInt();
		
		BiggestNumber num = new BiggestNumber(length);
		
        int array[]=new int[length];
		
		System.out.println("enter array elements");
		
		for(int i=0;i<length;i++)
		{
		 array[i]=s.nextInt();
		}
		
		num.big(array);
	}

}
