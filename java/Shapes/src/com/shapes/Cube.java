package com.shapes;

import java.util.Scanner;


public class Cube  extends Shapes{
	
	
	public void draw() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter breadth to draw a cube");
		int breadth=sc.nextInt();
		System.out.println("enter length to draw a cube");
		int length=sc.nextInt();
		System.out.println("enter hieght to draw a cube");
		int height=sc.nextInt();
		
		System.out.println("Cube drawn with length "+length+" and breadth"+breadth+" and height"+height);
	
	}

}