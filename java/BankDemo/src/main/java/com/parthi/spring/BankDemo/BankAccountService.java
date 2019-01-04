package com.parthi.spring.BankDemo;

public interface BankAccountService
{
	public double withdraw(long accountId, double balance) throws LowBalanceException;
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont)
			throws BankAccountNotFoundException, LowBalanceException;

}
