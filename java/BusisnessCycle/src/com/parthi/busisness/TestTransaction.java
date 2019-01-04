package com.parthi.busisness;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTransaction {

	public static void main(String[] args) 
	{
		 List<Transaction> transaction = new ArrayList<>();
		 
		    transaction.add(new Transaction(new Trader("fruit7.ltd", "Pune"), 2011, 90000));
		    transaction.add(new Transaction(new Trader("fruit1.ltd", "Bangalore"), 2011, 10000));
			transaction.add(new Transaction(new Trader("fruit2.ltd", "Pune"), 2011, 70000));
			transaction.add(new Transaction(new Trader("fruit4.ltd", "Mumbai"), 2012, 50000));
			transaction.add(new Transaction(new Trader("fruit4.ltd", "Mumbai"), 2000, 30000));
			transaction.add(new Transaction(new Trader("fruit5.ltd", "Delhi"), 2010, 20000));
			transaction.add(new Transaction(new Trader("fruit6.ltd", "Chennai"), 2011, 30000));
			transaction.add(new Transaction(new Trader("fruit4.ltd", "Mumbai"), 2002, 50000));
			transaction.add(new Transaction(new Trader("fruit8.ltd", "Pune"), 2011, 80000));
			transaction.add(new Transaction(new Trader("fruit9.ltd", "Delhi"), 2011, 30000));
			
			transaction.stream()
			.filter(t->t.getYear()==2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.forEach(t->System.out.println("\n"+t.getTrader()+" transaction value = "+t.getValue()+" in the year "+t.getYear()));
			
			List<String> uniqueCities =transaction.stream()
		    .map(t->t.trader.getCity())
			.distinct()
			.collect(Collectors.toList());
			
			System.out.println("\n \n the unique cities where the traders work are "+uniqueCities);
	
			
			transaction.stream()
			.filter(t->t.trader.getCity()=="Pune")
			.map(t->t.trader.getName())
			.sorted()
			.forEach(t->System.out.println("\n \nThe traders in pune are "+t));
			
			System.out.println("\n \nThe traders  are ");
			transaction.stream()
			.map(t->t.trader.getName())
			.distinct()
			.sorted()
			.forEach(t->System.out.print(" "+t));
			
			boolean answer= transaction.stream()
			.anyMatch(t->t.trader.getCity()=="Indore");
			
			System.out.println("\n \n Any traders based in Indore "+answer+"\n");

			
			transaction.stream()
			.filter(t->t.trader.getCity()=="Delhi")
			.forEach(t->System.out.println("\n The transactions done by "+t.trader.getName()+" in Delhi is "+t.getValue()));
			
			Transaction result=transaction.stream()
					   .max(Comparator.comparing( Transaction::getValue ))
					   .get();
			
			System.out.println("\n \nThe highest transaction done is "+result);
			
			Transaction result2=transaction.stream()
					   .min(Comparator.comparing( Transaction::getValue ))
					   .get();
			
			System.out.println("\n \n The smallest transaction done is "+result2);

	}

}
