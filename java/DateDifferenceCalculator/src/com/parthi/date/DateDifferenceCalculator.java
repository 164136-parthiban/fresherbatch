package com.parthi.date;

public class DateDifferenceCalculator 
{
	int monthDays[]= {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};

	long sum1,sum2;
	
	
	
	public long getDateDifference(MyDate startDate, MyDate endDate) 
	{
		
		sum1=startDate.getYyyy()*365+startDate.getDd()+noOfLeapYear(startDate);
		sum2=endDate.getYyyy()*365+endDate.getDd()+noOfLeapYear(endDate);
		
		for (int i=0; i<startDate.getMm() - 1; i++) 
		{
			 sum1+= monthDays[i];
	    }

		for (int i=0; i<endDate.getMm() - 1; i++) 
		{
			 sum2+= monthDays[i];
	    }

		
		return (sum2-sum1);
	
		
	}
	
	
	public int noOfLeapYear(MyDate date)
	{
	 
	 int year=date.getYyyy();
	 
	 if(date.getMm()<=2)
	 {
		 year--;
	 }
	 
     return (year/4)-(year/100)+(year/400);
	 
    }
			
	
}
