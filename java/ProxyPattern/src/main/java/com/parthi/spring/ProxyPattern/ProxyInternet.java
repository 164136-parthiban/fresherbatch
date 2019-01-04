package com.parthi.spring.ProxyPattern;
import java.util.ArrayList; 
import java.util.List; 

public class ProxyInternet
{
		private Internet internet = new RealInternet();
		
		private static List<String> bannedSites; 
		
		static
		{ 
			bannedSites = new ArrayList<String>(); 
			bannedSites.add("abc.com"); 
			bannedSites.add("def.com"); 
			bannedSites.add("ijk.com"); 
			bannedSites.add("lnm.com"); 
		} 
		
		public void connectTo(String serverhost) throws Exception 
		{ 
			if(bannedSites.contains(serverhost.toLowerCase())) 
			{ 
				throw new Exception("Access Denied"); 
			} 
			
			internet.connectTo(serverhost); 
		} 

	 


}
