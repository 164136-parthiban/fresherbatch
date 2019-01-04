package com.parthi.busisness;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestNews {

	public static void main(String[] args) 
	{
		 List<News> news = new ArrayList<>();
		 
		    news.add(new News(101, "parthi", "sneha", "amazing"));
			news.add(new News(102, "sneha", "parthi", "not good budget"));
			news.add(new News(103, "chaya", "sneha", "budget"));
			news.add(new News(104, "roshan", "parthi", "excellent"));
			news.add(new News(101, "parthi", "sneha", "amazing"));
			
			            Map<Integer,Long> id= news.stream().map(n->n.getNewsId()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
						
			      
						System.out.println("\nThe news id which received maximum comments is "+id);
						
						
						long comment=news.stream()
				        .filter(n->n.getComment().contains("budget"))
					    .count();
						
						System.out.println("\nThe word budget is used "+comment+" times");
						
						
						
						String user=news.stream()
					    .max( Comparator.comparing( News::getCommentByUser ) )
					    .get().getCommentByUser();
						
						System.out.println("\nThe user who posted maximum number of comments is "+user);
						
						 Map<String,Long> name=news.stream()
						.map(n->n.getCommentByUser())
						.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
								
						System.out.println("\nThe users and their no of comments \n"+name);
					   
			

	}

}
