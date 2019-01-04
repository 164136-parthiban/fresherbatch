package com.parthi.bank;

public class SavingAccount 
{
	
	 	private double accountBal;
	 	private int accountId;
	 	private String accountHolderName;
	 	
	 	public SavingAccount(double accountBal, int accountId, String accountHolderName)
	 	{
	 		
	 		this.accountBal = accountBal;
	 		this.accountId = accountId;
	 		this.accountHolderName = accountHolderName;
	 	}
	 	
	 	public double getAccountBal() {
	 		return accountBal;
	 	}

	 	public void setAccountBal(double accountBal) {
	 		this.accountBal = accountBal;
	 	}

	 	public int getAccountId() {
	 		return accountId;
	 	}
	

     	public void setAccountId(int accountId) {
	 		this.accountId = accountId;
	 	}
	
    	public String getAccountHolderName() {
	 		return accountHolderName;
	 	}
	 	
        public void setAccountHolderName(String accountHolderName) {
	 		this.accountHolderName = accountHolderName;
	 	}
	 	
	 	public boolean validateAmount(double amount)
	 	{
	 		if((amount<=0)&&(amount>accountBal))
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
	 			double temp =accountBal-amount;

	            if(temp<1000)	   
	 		   {
	 			   System.out.println("enter a valid amount");
	 		   }
	 		   else
	 		   {
	 			this.accountBal-=amount;	
	 			System.out.println(amount+" amount is withdrawn from customer account ");
	 		   }
	 		}
	 		
	 	}
	 	
	 	public void deposit(double amount)
	 	{
	       boolean validate=validateAmount(amount);
	 		
	 		if(validate==true)
	 		{  
	 			this.accountBal+=amount;	
	 			System.out.println(amount+" amount is deposited to customer account");
	 		}
	 		else
	 		{
	 			  System.out.println("enter a valid amount");
	 		}
	 		
	 	}

	 	@Override
	 	public String toString() {
	 		return "SavingAccount [accountBal=" + accountBal + ", accountId=" + accountId + ", accountHolderName="
	 				+ accountHolderName + "]";
	 	}
	 	

	 }
	  


