package com.mvc.dao;
import java.sql.ResultSet;
import java.util.List;
import javax.sql.DataSource;

import org.eclipse.jdt.internal.compiler.ast.ForeachStatement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.mvc.bean.LoginBean;


public class LoginJdbc
{
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) 
	   {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	   

		 public List<LoginBean> getUser()
		 {
		 String sql="select UNAME,PASS from members";
		 List <LoginBean> loginBean = jdbcTemplateObject.query(sql, new UserMapper());
		 
	     return loginBean;
		 }
		 
		 public String authenticateUser(LoginBean loginBean)
		 {
			 List <LoginBean> userBeans = getUser();
			 for (LoginBean loginBean2 : userBeans)
			 {
				if(loginBean2.equals(userBeans))
				{
					return "SUCCESS";
				}
			 }
			 
		 }
		 
		 
}
