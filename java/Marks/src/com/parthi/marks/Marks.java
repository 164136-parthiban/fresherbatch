package com.parthi.marks;

public class Marks {
	
	int m1,m2,m3;
	
	Marks(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public void print()
	{
		if((m1>=60)&&(m2>=60)&&(m3>=60))
		{
			System.out.println("passed");
		}
		else if(((m1>=60)&&(m2>=60))||((m1>=60)&&(m3>=60))||((m2>=60)&&(m2>=60)))
		{
			System.out.println("promoted");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
