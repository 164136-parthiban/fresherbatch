package com.parthi.hash;

import com.parthi.date.MyDate;

import java.util.*;
import java.util.Map.Entry;



public class HashMapExample 
{
 
	static HashMap<MyDate, String> employee = new HashMap<>();
	
	public static void main(String[] args)
	{	
		MyDate[] date= {new MyDate(30, 8, 1998),new MyDate(30, 8, 1996),new MyDate(30, 7, 1997),new MyDate(30, 8, 1998),new MyDate(30, 9, 1999)};

		employee.put(date[0], "jack");
		employee.put(date[1], "parthi");
		employee.put(date[2], "john");
		employee.put(date[3], "jack");
		employee.put(date[4], "mark");
	   
		System.out.println(employee);
		System.out.println();
		
		for(int i=0;i<employee.size();i++)
		{
		System.out.println("Name: "+get(date[i], employee)+"==>"+date[i]);
		}
		
	}
	
	private static String get(MyDate obj,HashMap<MyDate, String>  hm) {
		
		Set<MyDate> dates=employee.keySet();
		MyDate[] d=(MyDate[]) dates.toArray(new MyDate[0]);
		
		
		for(MyDate i:d){
		if(obj.getDd()==i.getDd() && obj.getMm()==i.getMm() && obj.getYyyy()!=i.getYyyy() )
		{
		return "fail";
		}
	     
		}
		
		return (String) hm.get(obj);
}
   
	
}

