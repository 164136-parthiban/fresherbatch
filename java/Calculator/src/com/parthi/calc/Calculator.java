package com.parthi.calc;

public class Calculator {
	
	double num1,num2,result;
	Calculator(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public double add()
	{
		result=num1+num2;
		return result;
	}
	public double div()
	{
		result=num1/num2;
		return result;
	}
	
	public double sub()
	{
		result=num1-num2;
		return result;
	}
	
	public double mul()
	{
		result=num1*num2;
		return result;
	}

}
