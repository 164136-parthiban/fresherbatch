package com.parthi.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
      
        HashSet<String> daysOfWeek = new HashSet<>();
        
        LinkedHashSet<String> daysOfWeek2=new LinkedHashSet<>();
       
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
      
        daysOfWeek2.add("Monday");
        daysOfWeek2.add("Tuesday");
        daysOfWeek2.add("Wednesday");
        daysOfWeek2.add("Thursday");
        daysOfWeek2.add("Friday");
        daysOfWeek2.add("Saturday");
        daysOfWeek2.add("Sunday");
        
        System.out.println("Hashset output\n");
        System.out.println(daysOfWeek);
        
        System.out.println("\n LinkedHashset output");
        System.out.println(daysOfWeek2);
        
       
        
    }
}