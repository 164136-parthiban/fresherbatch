package com.parthi.spring.SpringJdbcDemo;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) 
	{
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    StudentJdbcTemplate studentJDBCTemplate = context.getBean(StudentJdbcTemplate.class);
    
    System.out.println("------Records Creation--------" );
    studentJDBCTemplate.create("parthi", 22,01);
    studentJDBCTemplate.create("sneha", 22,02);
    studentJDBCTemplate.create("roshan", 22,03);

    System.out.println("\n------Listing Multiple Records--------" );
    
    List<StudentDao> students = studentJDBCTemplate.listStudentDaos();
    
    for (StudentDao record : students) 
    {
       System.out.print("ID : " + record.getId() );
       System.out.print(", Name : " + record.getName() );
       System.out.println(", Age : " + record.getAge());
    }

    System.out.println("\n----Updating Record with ID = 2 -----" );
    studentJDBCTemplate.update(2, 20);
    
    studentJDBCTemplate.delete(1);
    

    System.out.println("\n----Listing Record with ID = 2 -----" );
    
    StudentDao student = studentJDBCTemplate.getStudentDao(2);
    
    System.out.print("ID : " + student.getId() );
    
    System.out.print(", Name : " + student.getName() );
    
    System.out.println(", Age : " + student.getAge());
    
   
    
 }
}