package com.parthi.bank;

//package is collection of logical classes
public abstract class BankAccount {
	
	//static variable
	private static int autoAccountNo;
	
	//instance variable/class variable
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	//init block
	{
		
		accountNo=++autoAccountNo;
	}
	
	//constructor overloading
	//default constructor
	public BankAccount()
	{
		
		accountHolderName="unknow";
		accountBalance=0;
	
	}

	//parameterize constructor
	public BankAccount(String accountHolderName, double accountBalance)
	{
		
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	
	}

	//re-initialize/modify member variable
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
		
	public int getAccountNo() {
		return accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public boolean validateAmount(double amount)
	{
		if((amount<=0)&&(amount>accountBalance))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	//service methods
	public void withdraw(double amount)
	{
		boolean validate=validateAmount(amount);
		
		if(validate==true)
		{  
			double temp =accountBalance-amount;

           if(temp<1000)	   
		   {
			   System.out.println("enter a valid amount");
		   }
		   else
		   {
			this.accountBalance-=amount;	
			System.out.println(amount+" amount is withdrawn from customer account ");
		   }
		}
		
	}
	
	public void deposit(double amount)
	{
      boolean validate=validateAmount(amount);
		
		if(validate==true)
		{  
			this.accountBalance+=amount;	
			System.out.println(amount+" amount is deposited to customer account");
		}
		else
		{
			  System.out.println("enter a valid amount");
		}
		
	}

	/*public static void main(String[] args)
	{
	    
		BankAccount acc= new BankAccount();
		BankAccount acc2= new BankAccount("parthi",90000);
		acc2.deposit(2000);
		acc.deposit(2000);
		acc2.withdraw(200);
		acc.withdraw(2000);
		
	}*/
}




