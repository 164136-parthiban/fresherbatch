package com.parthi.login;

public class Login {

	String userid="pc";
	String password="pc";
	String temp1,temp2;
	
	Login(String id,String pwd)
	{
		temp1=id;
		temp2=pwd;
	}
	
	public void validate()
	{
		int i=3;
		int count=0;
		while(i>=1)
		{
			if((userid==temp1)&&(password==temp2))
			{
				System.out.println("welcome");
				System.out.println("user"+userid);
			}
			i--;
			count++;
		}
		if(count==3)
		{
			System.out.println("contact admin");
		}
	}

}
