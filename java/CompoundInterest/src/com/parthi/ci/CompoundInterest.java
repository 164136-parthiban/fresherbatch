package com.parthi.ci;

public class CompoundInterest {
	
	double rate,principle,amount,si,ci;
	int time;
	CompoundInterest(double amt,double rate,int time)
	{
		principle=amt;
		this.rate=rate;
		this.time=time;
	}
	
	public void print()
	{
		amount=principle*Math.pow((1+rate/100),time);
		ci=amount-principle;
		si=(principle*time*rate)/100;
		System.out.println("compound interest = "+ci);
		System.out.println("simple interest = "+si);		
	}

}
