package com.parthi.singleton;

class ObjectClass 
{

	
		private static ObjectClass single_instance = null; 

		
		public String str; 

		
		private ObjectClass() 
		{ 
			str = "Hello I am a string part of Singleton class"; 
		} 

		
		public static ObjectClass getInstance() 
		{ 
			if (single_instance == null) 
				single_instance = new ObjectClass(); 

			return single_instance; 
		} 
} 

 


	

