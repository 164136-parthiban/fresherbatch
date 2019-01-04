package com.parthi.spring.AutoWireDemo;

public class BankAccountServiceImpl implements BankAccountService  {

	BankAccountRepositoryImpl bankAccountRepositoryImpl=null;
	public BankAccountServiceImpl() {
		
	}

	public BankAccountServiceImpl(
			BankAccountRepositoryImpl bankAccountRepositoryImpl) {
		super();
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	public double withdraw(long accountId, double balance) {
	
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "withdraw");
	}

	public double deposit(long accountId, double balance) {
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "deposit");
		
	}

	public double getBalance(long accountId) {
		
		return bankAccountRepositoryImpl.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		double account1=withdraw(fromAccount, amount);
		if(account1!=0){
			double account2=deposit(toAccount, amount);
			if(account2!=0){
				return true;
			}
			deposit(fromAccount, amount);
		}
		return false;
	}

	
}
