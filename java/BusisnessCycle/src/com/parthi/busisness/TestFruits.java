package com.parthi.busisness;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestFruits {

	public static void main(String[] args) 
	{
		 List<Fruits> fruit = new ArrayList<>();
		 
		    fruit.add(new Fruits("apple", "red", 30, 60));
			fruit.add(new Fruits("mango", "yellow", 100, 50));
			fruit.add(new Fruits("pineapple", "yellow", 50, 70));
			fruit.add(new Fruits("orange", "orange", 30, 40));
			fruit.add(new Fruits("strawberry", "red", 100, 80));
			
			System.out.println("\n List of fruits according calories\n");
			fruit.stream()
			.filter(f->f.getCalories()<100)
			.sorted(Comparator.comparing(Fruits::getCalories).reversed())
			.forEach(f->System.out.println(f+"\n"));
				
			System.out.println("\n List of fruits according to color\n");
			fruit.stream()
			.sorted(Comparator.comparing(Fruits::getColor).reversed())
			.forEach(f->System.out.println(f.getColor()+"=>"+f.getName()+"\n"));
			
			System.out.println("\n List of fruits in red color\n");
			fruit.stream()
			.filter(f->f.getColor()=="red")
			.sorted(Comparator.comparing(Fruits::getPrice))
			.forEach(f->System.out.println(f+"\n"));
			

	}

}
