package com.parthi.spring.BankDemo;


public class BankAccountController 
{
	
	private BankAccountServiceImpl bankAccountServiceImpl;
	
	public BankAccountController(BankAccountServiceImpl bankAccountServiceImpl)
	{
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}


	public BankAccountController()
	{
		
	}

	public double withdraw(long accountId, double amount) throws LowBalanceException
	{
		return bankAccountServiceImpl.withdraw(accountId, amount);
		
	}

	public double deposit(long accountId, double amount)
	{
		return bankAccountServiceImpl.deposit(accountId, amount);
	}
	
	public double getBalance(long accountId)
	{
		return bankAccountServiceImpl.getBalance(accountId);
	}
	
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws BankAccountNotFoundException, LowBalanceException
	{
		return bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, amount);
	}

}
