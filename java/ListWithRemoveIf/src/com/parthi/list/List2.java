package com.parthi.list;

import java.util.ArrayList;
import java.util.List;


public class List2 {

	public static void main(String[] args)
	{
		  List<String> words = new ArrayList<>();
		  
		  words.add("Patient");
		  words.add("Admirable");
		  words.add("Respected");
		  words.add("Talented");
		  words.add("Honest");
		  words.add("Idealistic");
		  
		  words.stream()
		  .forEach(w->System.out.print(w.charAt(0)));
		 	
	}

}
