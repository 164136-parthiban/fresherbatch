package com.parthi.spring.SpringJdbcDemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<StudentDao> 
{
	   public StudentDao mapRow(ResultSet rs, int rowNum) throws SQLException
	   {
		      StudentDao student = new StudentDao();
		      student.setId(rs.getInt("id"));
		      student.setName(rs.getString("name"));
		      student.setAge(rs.getInt("age"));
		      
		      return student;
		}
	
}
