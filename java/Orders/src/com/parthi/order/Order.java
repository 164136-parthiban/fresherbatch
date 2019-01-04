package com.parthi.order;

import java.util.Scanner;

public class Order
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		double amount;
		
		System.out.println("enter the order total amount");
		amount=scanner.nextDouble();
		
		OrderStatus order1=()->{
			                     if(amount>10000)
			                    	 System.out.println("accepted");
			                     else
			                    	 System.out.println("rejected");
			
		                       };
	    order1.status();
		
	}

}

interface OrderStatus
{
	void status();
}