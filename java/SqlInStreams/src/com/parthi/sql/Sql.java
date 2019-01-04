package com.parthi.sql;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Sql {

	public static void main(String[] args)
	{
		List<EmployeeDetails> emp = new ArrayList<>();
		
		emp.add(new EmployeeDetails(121,"Parthi",10,"Cloud",2500,"Developer"));
        emp.add(new EmployeeDetails(141,"Sai",20,"BIU",2200,"Techie"));
        emp.add(new EmployeeDetails(112,"Rahul",10,"Cloud",2300,"Analyst"));
        emp.add(new EmployeeDetails(132,"Swathi",30,"IMS",2500,"Analyst"));
        emp.add(new EmployeeDetails(113,"Sahana",10,"Cloud",2000,"Clerk"));
        emp.add(new EmployeeDetails(124,"Zehara",30,"IMS",3000,"President"));
        emp.add(new EmployeeDetails(176,"Roshan",20,"BIU",3000,"Manager"));
        emp.add(new EmployeeDetails(144,"Siya",30,"IMS",1500,"Salesman"));
        emp.add(new EmployeeDetails(198,"Tanya",20,"BIU",1500,"salesman"));
        emp.add(new EmployeeDetails(198,"Gowshik",20,"BIU",1200,"Clerk"));
        
        
        System.out.println("All the departments are\n");
        emp.stream()
        .map(e->e.getDeptname())
        .distinct()
        .forEach(e->System.out.println(e));

        System.out.println("\n All the employees are\n");
        emp.stream()
        .map(e->e.getEmpname())
        .forEach(e->System.out.println(e));
        
        System.out.println("\n All the employees from depart no 30 are\n");
        emp.stream()
        .filter(e->e.getDeptno()==30)
        .map(e->e.getEmpname())
        .forEach(e->System.out.println(e));
        
        System.out.println("\n All the details of clerk \n");
        emp.stream()
        .filter(e->e.getPosition()=="Clerk")
        .forEach(e->System.out.println("employee name :"+e.getEmpname()+" => employee id : "+e.getEmp_id()));
        
        System.out.println("\n All the employees in department no 20 and 30\n");
        emp.stream()
        .filter(e->e.getDeptno()>=20)
        .sorted(Comparator.comparing(EmployeeDetails::getDeptno))
        .forEach(e->System.out.println("employee name :"+e.getEmpname()+" => department no : "+e.getDeptno()));
        
        System.out.println("\n the name, job and salary of all employees in dept 20 who earn more than 2000\n");
        emp.stream()
        .filter(e->e.getDeptno()==20)
        .filter(e->e.getSalary()>2000)
        .forEach(e->System.out.println("employee name :"+e.getEmpname()+" => job :"+e.getPosition()+" => salary: "+e.getSalary() ));
        
        System.out.println("\n All employees who are neither clerks nor manager but whose salary is greater than or equal to Rs. 2000.\n");
        emp.stream()
        .filter(e->e.getSalary()>2000)
        .filter(e->(e.getPosition()!="Clerk")&&(e.getPosition()!="Manager"))
        .forEach(e->System.out.println(e.getEmpname()));
        
        System.out.println("\n All the employees who earns between Rs. 1200 and Rs.2000.\n");
        emp.stream()
        .filter(e->(e.getSalary()>=1200)&&(e.getSalary()<=2000))
        .forEach(e->System.out.println(e.getEmpname()+" => salary :"+e.getSalary()));
        
        System.out.println("\n All the employees who are not clerks, analyst or salesman \n");
        emp.stream()
        .filter(e->(e.getPosition()!="Clerk")&&(e.getPosition()!="Analyst")&&(e.getPosition()!="Salesman"))
        .forEach(e->System.out.println(e.getEmpname()+" => position :"+e.getPosition()));
        
        
        System.out.println("\n All the employees who have the letter a as the second letter in their name.\n");
        emp.stream()
        .filter(e->e.getEmpname().indexOf("a")==1)
        .forEach(e->System.out.println(e.getEmpname()));
        
        System.out.println("\n The details of all employees, sorted on the names.\n");
        emp.stream()
        .map(e->e)
        .sorted(Comparator.comparing(EmployeeDetails::getEmpname))
        .forEach(e->System.out.println(e.getEmpname()+" => department name :"+e.getDeptname()+" => position :"+e.getPosition()+" => salary: "+e.getSalary()));
        
        System.out.println("\n The names, job and salary of all employees sorted on department no and Salary.\n");
        emp.stream()
        .map(e->e)
        .sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed())
        .sorted(Comparator.comparing(EmployeeDetails::getDeptno)) 
        .forEach(e->System.out.println(e.getEmpname()+" => department no:"+e.getDeptno()+" => position :"+e.getPosition()+" => salary: "+e.getSalary()));
      
        
        
	}

}
