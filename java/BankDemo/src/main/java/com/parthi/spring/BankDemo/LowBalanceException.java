package com.parthi.spring.BankDemo;

public class LowBalanceException extends Exception
{
public  void display() {
	System.out.println("low balance");
}
}
