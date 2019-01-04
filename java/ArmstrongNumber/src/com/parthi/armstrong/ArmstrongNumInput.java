package com.parthi.armstrong;

import java.util.Scanner;

public class ArmstrongNumInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s= new Scanner(System.in);
        System.out.println("enter the number\n");
        num=s.nextInt();
        ArmstrongNumber arm= new ArmstrongNumber();
         arm.validate(num) ;
    
	}

}
