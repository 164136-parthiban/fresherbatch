package com.parthi.test;

import com.parthi.bank.BankAccount;
import com.parthi.bank.CurrentAccount;
import com.parthi.bank.CurrentAccountVer2;
import com.parthi.bank.SavingAccount;
import com.parthi.bank.SavingAccountVer2;

public class TestBankAccount
{
	
	public static void testBankAccountMethod(){
		//BankAccount acc =new BankAccount();
		//acc.setAccountHolderName("parthi");
		
	}
	
	public static void testSavingAccount() 
	{
		SavingAccount savingAcc = new SavingAccount("parthi",30000);
		System.out.println("Account no is "+savingAcc.getAccountNo());
		System.out.println("Account holder name is "+savingAcc.getAccountHolderName());
		System.out.println("Account balance is "+savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		
		System.out.println("Account balance is "+savingAcc.getAccountBalance());
		savingAcc.withdraw(3000);
		System.out.println("Account balance is "+savingAcc.getAccountBalance());
		System.out.println("is this a salary account :");
		System.out.println(savingAcc.isSalaryAccount());
		System.out.println("-------------------------");
	}
	
	public static void testCurrentAccount() 
	{
		System.out.println("-------------------------");
		CurrentAccount currentAcc = new CurrentAccount("onkar",40000);
		System.out.println("Account no is "+currentAcc.getAccountNo());
		System.out.println("Account no is "+currentAcc.getAccountHolderName());
		System.out.println("Account balance is "+currentAcc.getAccountBalance());
		currentAcc.deposit(5000);
		
		System.out.println("Account balance is "+currentAcc.getAccountBalance());
		currentAcc.withdraw(55000);
		System.out.println("Account balance is "+currentAcc.getAccountBalance());
		currentAcc.odLimit();
		System.out.println("odlimit is "+currentAcc.odLimit());
	}

	public static BankAccount getBankAccount(String accountType)
	{
		BankAccount acc = null;
		if(accountType.equals("Saving"))
		{
			acc= new SavingAccount("onkar",4000);
			
		}
		else if(accountType.equals("Current"))
		{
			acc= new CurrentAccount("Rahul",7000);
		}
		else
		{
			acc=null;
		}
		return acc;
	}
		
	public static void main(String[] args) {
	//	testBankAccountMethod();
	//	testSavingAccount();
	//	testCurrentAccount();
		/*BankAccount acc= getBankAccount("Current");
		
		System.out.println("Account name is "+acc.getAccountHolderName());
		System.out.println("Account balance is "+acc.getAccountBalance());
		acc.deposit(5000);
		System.out.println("Account balance is "+acc.getAccountBalance());*/
		
		SavingAccountVer2 acc= new SavingAccountVer2();
		CurrentAccountVer2 acc2= new CurrentAccountVer2();
		
		acc.deposit(4000);
		acc.isSalaryAccount();
		System.out.println(acc.getInsuranceName());
		
		acc2.deposit(4000);
	
		System.out.println(acc2.getInsuranceName());
	}

}
