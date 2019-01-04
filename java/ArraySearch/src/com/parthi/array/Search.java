package com.parthi.array;
import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int num;
			System.out.println("enter the number to be searched");
            num=s.nextInt();
            
        ArraySearch arr = new ArraySearch(num);
        arr.search();
	}

}
