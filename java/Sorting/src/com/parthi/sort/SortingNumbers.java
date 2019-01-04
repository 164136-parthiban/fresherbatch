package com.parthi.sort;

import java.util.Scanner;

public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         
		Scanner s = new Scanner(System.in);
		
        
		
		System.out.println("enter the array length");
		int length=s.nextInt();
		
		Sorting sort = new Sorting(length);
		
        int array[]=new int[length];
		
		System.out.println("enter array elements");
		
		for(int i=0;i<length;i++)
		{
		 array[i]=s.nextInt();
		}
         
		System.out.println("ascending order enter 1 or descending order enter 2");
		int i=s.nextInt();
		if(i==1)
			sort.ascendingOrder(array);
		else
			sort.descendingOrder(array);
		
	}

}
