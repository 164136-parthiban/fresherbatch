package com.parthi.spring.StudentAspectDemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StudentAspect 
{
	@After("execution(public void display())")
	public void logging2()
	{
		System.out.println("after method called..");
	}
	
	@Before("execution(public void display())")
	public void logging()
	{
		System.out.println("method called..");
	}
	
	
	
}
