package com.parthi.list;

public class MyBankAccount
{

	private int accountId;
	private double accountBal;
	private String accountHolderName;
	
	public MyBankAccount(int accountId, double accountBal, String accountHolderName) {
		
		this.accountId = accountId;
		this.accountBal = accountBal;
		this.accountHolderName = accountHolderName;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "MyBankAccount [accountId=" + accountId + ", accountBal=" + accountBal + ", accountHolderName="
				+ accountHolderName + "]";
	}
	
	
	
	
	
}
