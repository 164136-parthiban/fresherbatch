package com.parthi.spring.SpringJdbcDemo;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbcTemplate 
{
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) 
	   {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	   
	   public void create(String name, Integer age, Integer id)
	   {
	      String SQL = "insert into student (age,name,id) values (?,?,?)";
	      jdbcTemplateObject.update( SQL, age,name,id);
	      System.out.println("Created Record Name = " + name + " Age = " + age);
	      return;
	   }
	   
	   public StudentDao getStudentDao(Integer id)
	   {
	      String SQL = "select * from student where id = ?";
	      StudentDao StudentDao = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{id}, new StudentMapper());
	      
	      return StudentDao;
	   }
	   
	   public List<StudentDao> listStudentDaos()
	   {
	      String SQL = "select * from student";
	      List <StudentDao> StudentDaos = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return StudentDaos;
	   }
	   
	   public void delete(Integer id) 
	   {
	      String SQL = "delete from student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }
	   
	   public void update(Integer id, Integer age)
	   {
	      String SQL = "update student set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
	   }

}
