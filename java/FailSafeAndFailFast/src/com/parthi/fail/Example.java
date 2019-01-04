package com.parthi.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Example {

	public static void main(String[] args)
	{
	
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		map.put("ONE", 1);
        
        map.put("TWO", 2);
 
        map.put("THREE", 3);
         
        map.put("FOUR", 4);
         
         
        System.out.println("using fail safe\n");
        Iterator<String> it = map.keySet().iterator();
         
        while (it.hasNext())
        {
            String key = (String) it.next();
             
            System.out.println(key+" : "+map.get(key));
             
            map.put("FIVE", 5);    
        }
        
        
        
        
        list.add(1452);
        
        list.add(6854);
         
        list.add(8741);
         
        list.add(6542);
         
        list.add(3845);
         
      
        System.out.println("\nusing fail fast\n"); 
        Iterator<Integer> it1 = list.iterator();
         
        while (it1.hasNext())
        {
            Integer integer = (Integer) it1.next();
             
            list.add(8457);   
        }
        
		
	}

}
