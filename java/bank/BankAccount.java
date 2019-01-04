package com.bank;

public abstract class BankAccount {

	private static int autoAccountNo;
	protected static double totalCashInBank;
	

private int accountNo;
private String accountHolderName;
private double accountBalance;

{
	 
	accountNo=++autoAccountNo;	
}
public BankAccount(){ 

	accountHolderName="unknow";
	accountBalance= 0;
}
public BankAccount(String accountHolderName,double accountBalance){

	this.accountHolderName=accountHolderName;
	this.accountBalance= accountBalance;
	totalCashInBank+=accountBalance;
}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

public double getAccountBalance() {
	return accountBalance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public int getAccountNo() {
	return accountNo;
}
public static double getTotalCashInBank() {
	return totalCashInBank;
}



}

