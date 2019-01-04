package com.shapes;

import java.util.Scanner;



public class Line extends Shapes{

	
	public void draw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x co ordinates x1 and x2");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		System.out.println("enter x co ordinates y1 and y2");
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		
		System.out.println("Line drawn from x coordinates "+x1+" "+x2+" and y co-ordinates"+y1+""+y2);
		
	}

	

}