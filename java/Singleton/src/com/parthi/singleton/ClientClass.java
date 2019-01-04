package com.parthi.singleton;

public class ClientClass
{

			public static void main(String args[]) 
			{ 
				
				ObjectClass x = ObjectClass.getInstance(); 

				
				ObjectClass y = ObjectClass.getInstance(); 

				
				ObjectClass z = ObjectClass.getInstance(); 

				
				x.str = (x.str).toUpperCase(); 

				System.out.println("String from x is " + x.str);
				System.out.println("String from y is " + y.str); 
				System.out.println("String from z is " + z.str); 
				System.out.println("\n"); 

				
				z.str = (z.str).toLowerCase(); 

				System.out.println("String from x is " + x.str); 
				System.out.println("String from y is " + y.str); 
				System.out.println("String from z is " + z.str); 
			} 
	} 


