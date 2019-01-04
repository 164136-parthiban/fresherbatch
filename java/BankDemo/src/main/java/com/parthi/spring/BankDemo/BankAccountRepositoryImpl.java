package com.parthi.spring.BankDemo;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	List<BankAccount> accounts=null;
	
	public BankAccountRepositoryImpl()
	{
		
	}

	public BankAccountRepositoryImpl(List<BankAccount> accounts) 
	{
		this.accounts = accounts;
	}
	
	public double getBalance(long accountId)
	{
	 BankAccount account=getBeanOfBankAccount(accountId);
		if(account!=null)
		return account.getAccountBalance();
		return accountId;
		
	}

	

	public double updateBalance(long accountId, double amount, String type)
	{	
		BankAccount account=getBeanOfBankAccount(accountId);
		if(account!=null){
			
			if(type.equals("withdraw")){
				account.setAccountBalance(account.getAccountBalance()-amount);
			}
			else if(type.equals("deposit"))
				account.setAccountBalance(account.getAccountBalance()+amount);
			return account.getAccountBalance();
			
		}
		return 0;	
	}

	public List<BankAccount> getAccounts()
	{
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts)
	{
		this.accounts = accounts;
	}

	private BankAccount getBeanOfBankAccount(long accountId)
	{
		if(accounts!=null)
		{
			for(BankAccount account:accounts )
			{
				if(account.getAccountId()==accountId)
				{
					return account;
				}
			}
		}
		return null;
	}
	
}

