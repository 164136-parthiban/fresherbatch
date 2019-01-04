package com.parthi.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample implements Comparator<Person> 
{
   

public static void main(String[] args) 
	{
		TreeSet<Person> weightComp = new TreeSet<Person>(new TreeSetExample());
		
		weightComp.add(new Person("parthi",6,60));
		weightComp.add(new Person("john",6,68));
		weightComp.add(new Person("jack",5.6,65));
		weightComp.add(new Person("karthi",6.5,80));
		weightComp.add(new Person("vijay",6.2,60));
		
        for(Person e:weightComp)
        {
            System.out.println(e);
        
	    }
	}



@Override
public int compare(Person p1, Person p2)
{
	if(p1.getWeight()>p2.getWeight())
	{
		return 1;
	}
	else if(p1.getWeight()==p2.getWeight())
	{
		if(p1.getHeight()>p2.getHeight())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
		return -1;
} 
}

