package com.parthi.movie;

import java.util.*;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieDetailsList 
{
	static ArrayList<MovieDetails> movie = new ArrayList<MovieDetails>();
		
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
	
		movie.add(new MovieDetails("kathi", "vijay", "samantha", "action"));
		movie.add(new MovieDetails("mersal", "vijay", "samantha", "action"));
		movie.add(new MovieDetails("theri", "vijay", "samantha", "action"));
		movie.add(new MovieDetails("arjun reddy", "vijay ", "shalini", "romance"));
		
		System.out.println("\nthe movie list are \n");
		for(int i=0;i<movie.size();i++)
		{
		System.out.println(movie.get(i));
		}
		

		System.out.println("\nsearching using movie name\n");
		for(int i=0;i<movie.size();i++)
		{
			if(movie.get(i).getMovieName()=="theri")
			{
				System.out.println(movie.get(i));
			}
			
		}
	

		System.out.println("\nsearching using genre\n");
		for(int i=0;i<movie.size();i++)
		{
			if(movie.get(i).getGenre()=="romance")
			{
				System.out.println(movie.get(i));
			}
			
		}
		
		System.out.println("\nenter your choice 1 :to sort in ascending order by movie name\n"
				                           + "2 :to sort in ascending order by genre ");
		int choice=scanner.nextInt();
        switch (choice) {
		case 1:Collections.sort(movie,(m1,m2)->m1.getMovieName().compareTo(m2.getMovieName()));
    			break;

			
       case 2:Collections.sort(movie,(m1,m2)->m1.getGenre().compareTo(m2.getGenre()));
			break;
			
		default:
			break;
		}
        
       
        for(int i=0;i<movie.size();i++)
		{
		System.out.println(movie.get(i));
		}
        
        movie.remove(1);
		System.out.println("\nafter removing a movie\n");
		for(int i=0;i<movie.size();i++)
		{
		System.out.println(movie.get(i));
		}
	
		movie.removeAll(movie);
		System.out.println("\nafter removing all movies\n");
		for(int i=0;i<movie.size();i++)
		{
		System.out.println(movie.get(i));
		}
	

        
		
	}

}

class SortByName
{
	public int compareTo(MovieDetailsList m)
	{
		int compareInt=this.compareTo(m);
		if(compareInt<0) return -1;
		if(compareInt>0) return 1;
		return 0;
	}
}


