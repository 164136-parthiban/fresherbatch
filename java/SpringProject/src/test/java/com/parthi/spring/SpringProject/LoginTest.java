package com.parthi.spring.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;

public class LoginTest 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	    LoginDao login = context.getBean(LoginDao.class);
	    
	   String result= login.authenticateUser(new LoginBean("parthi", "parthi"));
	   System.out.println(result);

	}
}
