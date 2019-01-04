package com.mvc.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.ProductBean;
import com.mvc.util.DBConnection;


@WebServlet("/searchDao")
public class SearchDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	 public String authenticateProduct(ProductBean productBean)
	 {
		 String productName = productBean.getProductName();
		 Connection con = null;
		 Statement statement = null;
		 ResultSet resultSet = null;
		 
		String productNameDB = "";
		 
		try
		 {
		 con = DBConnection.createConnection();
		 statement = con.createStatement(); 
		 resultSet = statement.executeQuery("select UNAME,PASS from members"); 
		 
		while(resultSet.next()) 
		 {
		  productNameDB = resultSet.getString("PRODUCTNAME");
	
		 
		   if(productName.equals(productNameDB))
		   {
		      return productBean.getProductName(); 
		   }
		 }
		 }
		 catch(SQLException e)
		 {
		 e.printStackTrace();
		 }
		 return "Invalid "; 
		 }
		 
		 
}
