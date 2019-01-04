package com.parthi.spring.BankDemo;

public class BankAccountNotFoundException extends Exception 
{
public void display()
{
	System.out.println("bank account not found");
}

}
