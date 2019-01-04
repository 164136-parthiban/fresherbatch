package com.parthi.students;

public class TotalAndAvg 
{
	public static void main(String[] args) 
	{
		
	
	int S1Marks1 = 45;
	int S1Marks2 = 50;
	int S1Marks3 = 38;

	int S2Marks1 = 46;
	int S2Marks2 = 38;
	int S2Marks3 = 40;

	int S3Marks1 = 38;
	int S3Marks2 = 40;
	int S3Marks3 = 50;

	int Student1total = S1Marks1 + S1Marks2 + S1Marks3;
	int AverageS1 = Student1total/3;
	
	System.out.println(Student1total);
	
	System.out.println(AverageS1);

	int Student2total = S2Marks1 + S2Marks2 + S2Marks3;
	int AverageS2 = Student2total/3;
	System.out.println(Student2total);
	System.out.println(AverageS2);

	int Student3total = S3Marks1 + S3Marks2 + S3Marks3;
	int AverageS3 = Student3total/3;
	System.out.println(Student3total);
	System.out.println(AverageS3);

	int Subject1total = S1Marks1 + S2Marks1 + S3Marks1;
	int SubAvg1 = Subject1total/3;
	System.out.println(Subject1total);
	System.out.println(SubAvg1);

	int Subject2total = S1Marks2 + S2Marks2 + S3Marks2;
	int SubAvg2 = Subject2total/3;
	System.out.println(Subject2total);
	System.out.println(SubAvg2);

	int Subject3total = S1Marks3 + S2Marks3 + S3Marks3;
	int SubAvg3 = Subject3total/3;
	System.out.println(Subject3total);
	System.out.println(SubAvg3);

		}

}
