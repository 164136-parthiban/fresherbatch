package com.mvc.login;

public class LoginService 
{
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("parthi") && password.equals("parthi");
	}
}
