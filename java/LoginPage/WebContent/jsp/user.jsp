<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.parthi.dao.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>

<%String userName=request.getParameter("userName"); %>
<%String password=request.getParameter("password"); %>

<%
Connection connection=ConnectionFactory.getConnection();

try{ 
	PreparedStatement statement =connection.prepareStatement("select * from userTable wher userName=? and Password = ?");
	statement.setString(1, userName);
	statement.setString(2, password);
    ResultSet resultSet = statement.executeQuery();

%>

<tr bgcolor="#DEB887"><%=resultSet.getString("userName") %></tr>
<tr bgcolor="#DEB887"><%=resultSet.getString("userType") %></tr>

Change Password : <input type="password" name="newPassword">

<% 
statement =connection.prepareStatement("UPDATE table userTable set password =? where userName=username");
statement.setString(1, "newPassword");
statement.executeUpdate();
%>

<%
}
catch (Exception e) 
{
e.printStackTrace();
}
%>


</f:view>
</body>
</html>