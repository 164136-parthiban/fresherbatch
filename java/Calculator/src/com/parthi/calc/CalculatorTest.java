package com.parthi.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator cal = new Calculator(20,4);
	double result;
	
	
	@Test
	public void test1() 
	{
		result=cal.add();
		assertEquals(24,result,0);
		System.out.println(result);
	}

	@Test
	public void test2() 
	{
		result=cal.sub();
		assertEquals(16,result,0);
		System.out.println(result);
	}
	
	@Test
	public void test3() 
	{
		result=cal.mul();
		assertEquals(80,result,0);
		System.out.println(result);
	}
	
	@Test
	public void test4() 
	{
		result=cal.div();
		assertEquals(5,result,0);
		System.out.println(result);
	}
}
