package com.parthi.list;

import java.util.Scanner;

public class List 
{

    static MyList<MyBankAccount> account = new MyList<>();
	
    static MyList<EmployeeDetails> employee = new MyList<>();

	public static void main(String[] args)
	{
		java.util.Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter no of bank accounts and employee details\n");
		int length = scanner.nextInt();
		
		System.out.println("enter account details\n"
				+"\naccount no\n"+"account bal\n"+"account holder name\n");
		
		for(int i=0;i<length;i++)
		{
			System.out.println("enter "+(i+1)+" account datails\n");
			account.add(i, new MyBankAccount(scanner.nextInt(), scanner.nextDouble(),scanner.next()));
		}
		
		
		System.out.println("enter employee details"
				+"\nemployee id\n"+"employee name\n"+"salary\n");
		
		for(int i=0;i<length;i++)
		{
			System.out.println("enter "+(i+1)+" employee datails\n");
			employee.add(i, new EmployeeDetails(scanner.nextInt(), scanner.next(), scanner.nextDouble()));
		}
		
	    System.out.println("\n account details");
		
		for(int i=0;i<length;i++)
		{
			System.out.println(account.get(i));
		}
		
	    System.out.println("\n employee details");
		
		for(int i=0;i<length;i++)
		{
			System.out.println(employee.get(i));
		}
		
		account.remove(1);
		
		System.out.println("\nafter removing a bank account\n");
		
		for(int i=0;i<length-1;i++)
		{
			System.out.println(account.get(i));
		}
		
		employee.remove(1);
		
		System.out.println("\nafter removing a employee\n");
		
		for(int i=0;i<length-1;i++)
		{
			System.out.println(employee.get(i));
		}
		
		System.out.println("\nenter the index to get account details");
		int id= scanner.nextInt();
		System.out.println("\nthe account details are: "+account.get(id));
		

		System.out.println("\nenter the index to get employee details");
		int id2= scanner.nextInt();
		System.out.println("\nthe employee details are: "+employee.get(id2));
		
	
		
		
	}


}
