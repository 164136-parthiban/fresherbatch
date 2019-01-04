package com.parthi.list;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class ListUsingMaps 
{
	
	public static void main(String[] args)
	{
		Hashtable<String, String> map = new Hashtable<>(5);
	      map.put("name ", "parthi ");
	      map.put("age ", "22 ");
	      map.put("D.O.B ", " 05/10/1996 ");
	      
	      map.entrySet().stream().map(entry->entry.getKey().concat(entry.getValue()).replaceAll("\n",""))
	      .forEach(m-> System.out.print(m));
	     
		
	}

}
