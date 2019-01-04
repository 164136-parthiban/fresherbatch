package com.parthi.list;

import java.util.ArrayList;

public class MyList<T> 
{
	
	ArrayList<T>list= new ArrayList<>();
	
	public  T get(int i)
	{
		return list.get(i);
	}
	
	
	public void add(int i, T t)
	{
		list.add(t);
	}

	
	public void remove(int i) 
	{
		list.remove(i);			
	}

}


