package com.parthi.test;

import com.parthi.dateref.MyDate;

import com.parthi.date.DateDifferenceCalculator;

import com.parthi.testrec.TestRecord;

public class TestDateDifferenceCalculator 
{
	public static void main(String[] args)
	{
		 DateDifferenceCalculator dateDifference=new DateDifferenceCalculator();
		
		 TestRecord[] myTestRecord=new TestRecord[15];
		 
		 myTestRecord[0]=new TestRecord(new MyDate(20,11,2018),new MyDate(20,11,2018),0);
		 myTestRecord[1]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,04,2011),12);
		 myTestRecord[2]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,05,2011),42);
		 myTestRecord[3]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,06,2011),73);
		 myTestRecord[4]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,12,2011),256);
		 myTestRecord[5]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,12,2012),622);
		 myTestRecord[6]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,12,2013),987);
		 myTestRecord[7]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,12,2113),37511);
		 myTestRecord[8]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,12,2413),147084);
		 myTestRecord[9]=new TestRecord(new MyDate(06,04,2011),new MyDate(18,12,2813),293181);
		 myTestRecord[10]=new TestRecord(new MyDate(06,01,2011),new MyDate(06,03,2011),59);
		 myTestRecord[11]=new TestRecord(new MyDate(06,02,2012),new MyDate(06,03,2012),29); 
		 myTestRecord[12]=new TestRecord(new MyDate(06,02,2012),new MyDate(06,12,2012),304);
		 myTestRecord[13]=new TestRecord(new MyDate(06,01,2012),new MyDate(06,03,2012),60);
		 myTestRecord[14]=new TestRecord(new MyDate(22,01,2012),new MyDate(15,11,2012),298);
		 
		 for(int index=0; index<myTestRecord.length;index++)
		 {
			 long calculatedDiff=dateDifference.getDateDifference(myTestRecord[index].getStartDate(),myTestRecord[index].getEndDate());
		     
			 if(calculatedDiff==myTestRecord[index].getActualDifference())
			 {
				 System.out.println("\ntest case passed");
			 }
			 else
			 {
				 System.err.println("\ntest case failed "+calculatedDiff);
			 }
		 }
		 
	}
}
