package com.parthi.spring.AutoWireDemo;

public class BankAccountController 
{
	private BankAccountServiceImpl bankAccountServiceImpl;
	public BankAccountController(BankAccountServiceImpl bankAccountServiceImpl) {
		super();
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}


	public BankAccountController() {
		// TODO Auto-generated constructor stub
	}

	
	public double withdraw(long accountId, double balance){
		return bankAccountServiceImpl.withdraw(accountId, balance);
	}
	public double deposit(long accountId, double balance){
		return bankAccountServiceImpl.deposit(accountId, balance);
	}
	public double getBalance(long accountId){
		return bankAccountServiceImpl.getBalance(accountId);
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amont){
		return bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, amont);
	}

}
