package com.parthi.math;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args)
	{
		int num1;
		int num2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter two numbers\n");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		
		AddOperation op1=()->num1+num2;
		System.out.println("sum= "+op1.add());
		
		SubOperation op2=()->num1-num2;
		System.out.println("difference= "+op2.sub());
		
		MulOperation op3=()->num1*num2;
		System.out.println("product= "+op3.mul());
		
		DivOperation op4=()->num1/num2;
		System.out.println("quotient= "+op4.div());

		
	}

}

interface AddOperation
{
	int add();
}

interface SubOperation
{
	int sub();
}

interface MulOperation
{
	int mul();
}

interface DivOperation
{
	int div();
}