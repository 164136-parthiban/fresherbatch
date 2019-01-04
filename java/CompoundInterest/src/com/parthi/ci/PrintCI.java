package com.parthi.ci;
import java.util.Scanner;
public class PrintCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		double principle,rate;
		int time;
		System.out.println("enter the principle amount");
		principle=s.nextDouble();
		System.out.println("enter the interest rate");
		rate=s.nextDouble();
		System.out.println("enter the time");
		time=s.nextInt();
		CompoundInterest ci = new CompoundInterest(principle,rate,time);
        ci.print();
	}

}
