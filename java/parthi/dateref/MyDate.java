package com.parthi.dateref;

public class MyDate 
{
	@Override
	public String toString()
	{
		return "MyDate [mm=" + mm + ", dd=" + dd + ", yyyy=" + yyyy + "]";
	}


	private int mm;
	private int dd;
	private int yyyy;
	
	public int getMm() 
	{
		return mm;
	}
	
	public void setMm(int mm) 
	{
		this.mm = mm;
	}
	
	public int getDd()
	{
		return dd;
	}
	
	public void setDd(int dd) 
	{
		this.dd = dd;
	}
	
	public int getYyyy()
	{
		return yyyy;
	}
	
	public void setYyyy(int yyyy)
	{
		this.yyyy = yyyy;
	}
	

	public MyDate(int dd, int mm, int yyyy) 
	{
		super();
		this.mm = mm;
		this.dd = dd;
		this.yyyy = yyyy;
	}

	

}
