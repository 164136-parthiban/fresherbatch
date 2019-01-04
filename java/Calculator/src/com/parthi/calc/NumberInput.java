package com.parthi.calc;
import java.util.Scanner;
public class NumberInput {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		float num1,num2;
		
		System.out.println("enter 2 numbers");
        num1=s.nextFloat();
        num2=s.nextFloat();
        
        Calculator c= new Calculator(num1,num2);
       
        System.out.println("enter your choice"
        		 +"\n1 : add"
        		 +"\n2 : sub"
        		 +"\n3 : mul"
        		 +"\n4 : div");
        
        int choice=s.nextInt();
        switch (choice) {
		case 1:
			System.out.println(c.add());
			break;
        
		case 2:
			System.out.println(c.sub());
			break;
			
		case 3:
			System.out.println(c.mul());
			break;
			
		case 4:
			System.out.println(c.div());
			break;
			
		default:
			System.out.println("invalid input");
			break;
		}
       
      
	}

}
