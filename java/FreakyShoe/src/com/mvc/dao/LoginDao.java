package com.mvc.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mvc.bean.LoginBean;
import com.mvc.util.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginDao")
public class LoginDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 public String authenticateUser(LoginBean loginBean)
	 {
	 
	String userName = loginBean.getUserName(); 
	 String password = loginBean.getPassword();
	 
	Connection con = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	 
	String userNameDB = "";
	 String passwordDB = "";
	 
	try
	 {
	 con = DBConnection.createConnection();
	 statement = con.createStatement(); 
	 resultSet = statement.executeQuery("select UNAME,PASS from members"); 
	 
	while(resultSet.next()) 
	 {
	  userNameDB = resultSet.getString("UNAME");
	  passwordDB = resultSet.getString("PASS");
	 
	   if(userName.equals(userNameDB) && password.equals(passwordDB))
	   {
	      return "SUCCESS"; 
	   }
	 }
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Invalid user credentials"; 
	 }
}