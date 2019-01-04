package com.parthi.spring.BankDemo;

public interface BankAccountRepository
{
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance, String type);
}