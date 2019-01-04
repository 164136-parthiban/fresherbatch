package com.bank;


import com.bank.BankAccount;

public class SavingsAccount extends BankAccount{
private boolean isSalaryAccount;
private double fixedDeposit;

public SavingsAccount(){
this.isSalaryAccount=true;
}
public boolean issalaryAccount() {
	return this.isSalaryAccount;
}
public SavingsAccount(String accountHolderName,double amount,double Fixeddeposit){
	super(accountHolderName,amount);
	this.isSalaryAccount=true;
	this.fixedDeposit=Fixeddeposit;
	totalCashInBank+=Fixeddeposit;
}

public SavingsAccount(String accountHolderName,double amount,boolean isSalaryAccount,double Fixeddeposit){
	super(accountHolderName,amount);
	this.isSalaryAccount=isSalaryAccount;
	this.fixedDeposit=Fixeddeposit;
}
public double getAccountBalance() {
	return getAccountBalance();
}
public double getFixedDeposit() {
	return fixedDeposit;
}

}