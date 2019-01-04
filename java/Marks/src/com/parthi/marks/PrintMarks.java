package com.parthi.marks;
import java.util.Scanner;
public class PrintMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 subject marks");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        Marks m = new Marks(m1,m2,m3);
        m.print();
	}

}
