package com.parthi.spring.BankDemo;

public class BankAccountServiceImpl implements BankAccountService
{

	BankAccountRepositoryImpl bankAccountRepositoryImpl=null;
	
	public BankAccountServiceImpl() 
	{
		
	}

	public BankAccountServiceImpl(BankAccountRepositoryImpl bankAccountRepositoryImpl) 
	{
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws BankAccountNotFoundException, LowBalanceException 
	{
		double account1=withdraw(fromAccount, amount);
		if(account1!=0)
		{
			double account2=deposit(toAccount, amount);
			if(account2!=0)
			{
				return true;
			}
			deposit(fromAccount, amount);
		}
		return false;
	}
		
	

	public double withdraw(long accountId, double amount) throws LowBalanceException 
	{
		return bankAccountRepositoryImpl.updateBalance(accountId, amount, "withdraw");
	}

	public double deposit(long accountId, double amount)
	{
		return bankAccountRepositoryImpl.updateBalance(accountId, amount, "deposit");
	}

	public double getBalance(long accountId)
	{
		return bankAccountRepositoryImpl.getBalance(accountId);
	}

	
}
