package com.bank;

import com.bank.BankAccount;

public class CurrentAccount extends BankAccount {

	private double cashCredit;
	
	{
		this.cashCredit=20000;
		
	}
	public CurrentAccount(){
    
	}
	public CurrentAccount(String accountHolderName,double amount){
		super(accountHolderName,amount);
		
	}
	
public double getcashCredit(){
	return cashCredit;
	
}




}

