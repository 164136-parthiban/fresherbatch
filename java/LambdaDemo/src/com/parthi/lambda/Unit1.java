package com.parthi.lambda;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Unit1 {

	public static void main(String[] args)
	{
		List <Person>people = Arrays.asList(new Person("parthiban", "navaneethan", 22),
				new Person("roshan", "kanwal", 22),
				new Person("sneha", "as", 22));
				
		Collections.sort(people,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		for(Person p :people)
		{
			System.out.println(p);
		}

	}

}
