package com.mvc.util;
 
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.annotation.WebServlet;
 
@WebServlet("/DBConnection")
public class DBConnection {
 
 public static Connection createConnection()
 {
 Connection con = null;
 String url = "jdbc:oracle:thin:@localhost:1521:XE"; //MySQL URL followed by the database name
 String username = "system"; //MySQL username
 String password = "orc11g"; //MySQL password
 
 try 
 {
 try 
 {
 Class.forName("oracle.jdbc.driver.OracleDriver"); //loading MySQL drivers. This differs for database servers 
 } 
 catch (ClassNotFoundException e)
 {
 e.printStackTrace();
 }
 
 con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 System.out.println("Printing connection object "+con);
 } 
 catch (Exception e) 
 {
 e.printStackTrace();
 }
 
 return con; 
 }
}