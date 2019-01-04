package com.parthi.bank;

import java.util.Collection;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class BankAccountList 
 {

	public static void main(String[] args)
	{
		SortedSet<SavingAccount> account = new TreeSet<SavingAccount>(new duplicateAccount());
			
		account.add(new SavingAccount(60000, 1234, "parthi"));
		account.add(new SavingAccount(60000, 1234, "parthi"));
		account.add(new SavingAccount(60000, 1234, "jack"));
		account.add(new SavingAccount(60000, 1235, "jack"));
		account.add(new SavingAccount(60000, 1236, "john"));
		account.add(new SavingAccount(60000, 1237, "keerthi"));
		account.add(new SavingAccount(60000, 1238, "naveen"));
		
		
		for(SavingAccount acc:account)
        {
            System.out.println(acc);
        
	    }

	}
 }


class duplicateAccount implements Comparator<SavingAccount>
{

	@Override
	public int compare(SavingAccount o1, SavingAccount o2) 
	{
		if(o1.getAccountId()==o2.getAccountId())
		{
		 return 0;
		}
		return 1;
	}
	
}
