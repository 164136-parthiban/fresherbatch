package com.parthi.lambda;

public class Welcome {

	public void welcome(Greeting welcome)
	{
		welcome.greet();
		
	}
	public static void main(String[] args) 
	{
		Greeting myFunction=() -> System.out.println("welcome !!");
		myFunction.greet();
		
	}

}
