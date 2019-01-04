package com.parthi.spring.ProxyPattern;

public class Client 
{
	public static void main (String[] args) 
    { 
        ProxyInternet internet = new ProxyInternet(); 
        
        try
        { 
            internet.connectTo("Parthi.org"); 
            internet.connectTo("abc.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 
}
