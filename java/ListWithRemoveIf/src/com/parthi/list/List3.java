package com.parthi.list;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) 
	{
		 List<String> words = new ArrayList<>();
		  
		  words.add("Patient");
		  words.add("Admirable");
		  words.add("Respected");
		  words.add("Talented");
		  words.add("Honest");
		  words.add("Idealistic");
		  
		  System.out.println(words+"\n");
		  	  
		  words.stream()
		  .forEach(w->System.out.println(w.replaceAll(w, w.toUpperCase())));
		  
		  
		  
	}

}
