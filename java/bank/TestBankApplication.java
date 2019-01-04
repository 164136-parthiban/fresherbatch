package com.bank;




public class TestBankApplication {
/*public static void testBankAccountMethod(){
	BankAccount acc= new BankAccount();
	acc.setAccountHolderName("Sachin");
	
}*/
public static void testSavingAccount(){
	SavingsAccount savacc= new SavingsAccount("deva",5000,50000);
	System.out.println("Account name is:"+savacc.getAccountHolderName());
	System.out.println("Account no is:"+savacc.getAccountNo());
	

	System.out.println("Total cash in bank Balance  "+savacc.getTotalCashInBank());
}
public static void testCurrentAccount(){
	CurrentAccount curacc= new CurrentAccount("chandu",40000);
	System.out.println("Account name is:"+curacc.getAccountHolderName());
	System.out.println("Account no is:"+curacc.getAccountNo());

	System.out.println("Account Balance "+curacc.getAccountBalance());
	System.out.println("cash credit Balance  "+curacc.getcashCredit());
}
public static void main(String args[]){
	//testBankAccountMethod();
	testCurrentAccount();
	testSavingAccount();
	double cash=BankAccount. getTotalCashInBank();
	System.out.println(cash);
	
}
	
}
