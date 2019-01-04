package com.parthi.bank;

public class CurrentAccount extends BankAccount
{
	double odLimit;
	
	{
		odLimit=20000;
	}

	public CurrentAccount(String accountHolderName,double accountBalance)
	{
	
	  super(accountHolderName, accountBalance);	
	  this.odLimit=20000;
	}
	
	public CurrentAccount()
	{
	 this.odLimit=20000;
	}
	
	public double odLimit()
	{
		return odLimit;
	}
	
	public void withdraw(double amount)
	{
		
		if(amount<accountBalance)
		{
			accountBalance=accountBalance-amount;
		}
		else if(amount<=(accountBalance+odLimit))	
		{
			odLimit=(accountBalance+odLimit)-amount;
			accountBalance=0;
			System.out.println(amount+" amount is withdrawn");
		}
		else
		{
			System.out.println("amount cannot be withdraw");
		}
	}

}
