package com.parthi.login;
import java.util.Scanner;
public class LoginUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String user,password;
     Scanner s = new Scanner(System.in);
     System.out.println("enter user name\n");
     user=s.nextLine();
     System.out.println("enter password\n");
     password=s.nextLine();
     Login l = new Login(user,password);
     l.validate();
	}

}
