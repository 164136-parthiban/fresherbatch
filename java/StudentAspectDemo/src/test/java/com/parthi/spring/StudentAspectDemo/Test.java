package com.parthi.spring.StudentAspectDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		StudentDao info = context.getBean(StudentDao.class);
		info.display();
		
	}

}
