package com.parthi.list;

import java.util.function.Consumer;

import java.util.ArrayList;

public class ThreadImplementation {

	private static Runnable run;

	public static void main(String[] args) 
	{

     ArrayList<Integer> numbers= new ArrayList<>();
     numbers.add(10);
     numbers.add(20);
     numbers.add(30);
     numbers.add(40);
     numbers.add(50);
     numbers.add(60);
     numbers.add(70);
     numbers.add(80);
     numbers.add(90);
     numbers.add(100);
     
     
     
     Thread thread = new Thread()
     {
    	 public void run()
    	 {
    		 System.out.println(numbers);
    	 }
	};
     
	thread.start();
         

	}

}
