package com.parthi.spring.BankDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test()
	{
		
	}

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		BankAccountController controller=context.getBean(BankAccountController.class);
		
		System.out.println("account 1 balance :"+controller.getBalance(1));
		
		System.out.println("depositing to account 1: "+controller.deposit(1, 5000));
		
		try
		{
			System.out.println("withdrawing from account 2: "+controller.withdraw(2, 10000));
			
		}
		catch (LowBalanceException e1) 
		{
			e1.display();
		}
		
		System.out.println(" account 2 balance " + controller.getBalance(2));
		
		try
		{
			try 
			{
				System.out.println("fund transfer from 1 to 2 account :"+controller.fundTransfer(1, 2, 10000));
			} 
			catch (LowBalanceException e)
			{
				e.display();
			}
		}
		catch (BankAccountNotFoundException e)
		{	
			e.display();
		}
		
		System.out.println(" account 1 balance: " + controller.getBalance(1));
		System.out.println("account 2 balance: " + controller.getBalance(2));
		
	}
}
