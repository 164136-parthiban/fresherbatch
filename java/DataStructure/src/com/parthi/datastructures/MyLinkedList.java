package com.parthi.datastructures;

import java.util.LinkedList;
import java.util.Scanner;

public class MyLinkedList implements MyList
{

	LinkedList <Integer> list = new LinkedList<Integer>();
	Scanner s = new Scanner(System.in);
	
	Object item;
	MyLinkedList next;
	
	MyLinkedList head;
    MyLinkedList temp;
	
	
	int length;
	
	@Override
	public void add()
	{
		System.out.println("enter linkedlist length \n");
  		length=s.nextInt();
  		System.out.println("enter linkedlist elements \n");
  		
  		for(int i=0;i<length;i++)
  		{
  			 list.add(s.nextInt());
  		}
		
  		System.out.println("linkedlist");
  		
  		for(int i=0;i<length;i++)
  		{
  			 System.out.println(list.indexOf(i));
  		}
	}

	@Override
	public void search(int number) 
	{
		int temp=number;
		int flag=0;
	
		for(int i=0;i<length;i++)
  		{
  			if(list.indexOf(i)==temp)
  			{
  				System.out.println(number+" is found in the linked list ");
  				flag=1;
  			}
  			
  		}
		
		if(flag==0)
			{
				System.out.println(number+" is not found in the linked list \n");
			}
		
		
	}

	@Override
	public void sort()
	{
		    
		  if(list.isEmpty())
	            System.out.println("List is currently empty.");
	        else if (list.size() == 1)
	            System.out.println("List is already sorted.");
	        else{}
	    }
	
	@Override
	public void update(int number, int position) 
	{
		list.set(number,position);
		
	}

	@Override
	public void remove(int number) 
	{
		
		list.remove(number);
		
	}

}
