package com.parthi.incometax;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary to calculate tax ");
		double salary=sc.nextDouble();
		IncomeTax income=new IncomeTax(salary);
		income.calculateTax();
	}

}