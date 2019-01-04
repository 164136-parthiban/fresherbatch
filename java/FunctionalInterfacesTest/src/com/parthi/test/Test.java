package com.parthi.test;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		double num;
		
		System.out.println("enter the temperature in centigrade\n");
		num=scanner.nextDouble();
		
		Function<Integer,Double> centigradeToFahrenheitInt = x -> new Double((x*9/5)+32);
		System.out.println("\ntemperature in fahrenheit :"+centigradeToFahrenheitInt.apply((int) num));

		Predicate<String> isALongWord = t->t.length()>20;
		
		System.out.println("enter a string\n");
		String s = scanner.next();
		
		System.out.println("Is it a long word : "+isALongWord.test(s));
		
		
	    Consumer<Product> updatePrice = p -> p.setPrice(5.9);
		Product p = new Product();
		updatePrice.accept(p);
		p.printPrice();
		
		Supplier num1=()-> num + num;
		System.out.println("\nsupplier output :"+num1.get());

		
	}

}
