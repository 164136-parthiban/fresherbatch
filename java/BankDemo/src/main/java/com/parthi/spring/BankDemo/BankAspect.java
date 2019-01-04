package com.parthi.spring.BankDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.ThrowsAdvice;

@Aspect
public class BankAspect 
{
   @Before("execution(public double getAccountBalance())")
   public void display()
   {
       System.out.println(" method called....");
   }
   
   
}
