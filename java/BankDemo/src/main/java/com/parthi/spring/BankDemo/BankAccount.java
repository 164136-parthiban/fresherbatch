package com.parthi.spring.BankDemo;

public class BankAccount 
{
	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}


	public BankAccount(int accountId, String accountHolderName,
			String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
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


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + "]";
	}

	

}
