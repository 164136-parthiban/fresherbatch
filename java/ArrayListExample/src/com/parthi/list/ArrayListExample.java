package com.parthi.list;

import java.util.*;

public class ArrayListExample 
{

	 public static void main(String[] args) {
		  
		    ArrayList aList = new ArrayList();
		   
		    
		    aList.add("1");
		    aList.add("2");
		    aList.add("3");
		    aList.add("4");
		    aList.add("5");
		   
		
		    ListIterator listIterator = aList.listIterator();
		 
		   
		    System.out.println("Traversing ArrayList in forward direction using ListIterator");
		    while(listIterator.hasNext())
		      System.out.println(listIterator.next());
		  
		    System.out.println("Traversing ArrayList in reverse direction using ListIterator");
		    while(listIterator.hasPrevious())
		      System.out.println(listIterator.previous());
		     
		  }
}


