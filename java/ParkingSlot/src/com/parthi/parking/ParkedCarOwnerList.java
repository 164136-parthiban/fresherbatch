package com.parthi.parking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ParkedCarOwnerList<Public>
{
	
	 static List<ParkedCarOwnerDetails> addCar = new ArrayList<>();
	
	
	public static void main(String[] args)
	{
		Array[] floor=new Array[3];
		Array[] section=new Array[4];
		Array[] slots=new Array[20];
		 
		
		addCar.add(new ParkedCarOwnerDetails("Parthi", "Audi", "Bangalore", "0303", "9739220198"));
		addCar.add(new ParkedCarOwnerDetails("Roshan", "BMW", "Mumbai", "0909", "3216549871"));
		addCar.add(new ParkedCarOwnerDetails("Urvi", "Jaguar", "Pune", "0111", "1234567890"));
		addCar.add(new ParkedCarOwnerDetails("Sneha", "BMW", "Bangalore", "2121", "3664564625"));
		
		
		
		for(int k=240;k>0;k--)
				{
					if(addCar.isEmpty()==false)
					{	
					getParkedCarLocation(k+1);
					}
					else
					{
					break;
					}
					
				}
			

		System.out.println("enter the car model no");	
		
		
		
		
	}

	private static void getParkedCarLocation(int i) 
	{
		int slot=i-240+1;
		int floor=3;
		int section=4;
		int full=0;
		int count=0;
		
		if(full==0)
		{
		for(int j=1;j<floor;j++)
		{
			for(int k=1;k<section;k++)
			{
				for(int l=0;l<slot;l++)
				{
					if(slot<20)
					{
					System.out.println("floor no"+j+"section no "+k+"slot no "+l);
					count++;
				    }
					else if(count==addCar.size())
					{
						full=1;
						break;
					}
			   }
		   }
		}
		}
		
	   }
	  

	private static void removeCar(boolean b)
	{
		
	}


}
