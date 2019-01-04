package com.mvc.dao;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.bean.LoginBean;
import com.mvc.util.UserMapper;

public class LoginDao 
{
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) 
	   {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	    
	   public boolean getUser(LoginBean login)
	   {
		   String sql="select * from members where UNAME=? and PASS =?";
		   String userName= login.getUserName();
		   String password= login.getPassword();
		   LoginBean user= (LoginBean) jdbcTemplateObject.queryForObject(sql,new Object[]{userName,password}, new UserMapper());
		   if(user!=null)
		   {
			   return true;
		   }
		  return false;
	   }
	   
	   public String authenticateUser(LoginBean loginbean)
	   {
		   boolean user = getUser(loginbean);
		   if(user==true)
		   {
			   return "SUCCESS";
		   }
	
		   return "invalid!!";
		   
	   }
	   
	  
}
