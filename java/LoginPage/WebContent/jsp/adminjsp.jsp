<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.parthi.dao.ConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parthi Website</title>
</head>
<body>
<f:view>

<%int count=1; %>

<%
Connection connection=ConnectionFactory.getConnection();
try{ 
	PreparedStatement statement =connection.prepareStatement("select * from userTable");

   ResultSet resultSet = statement.executeQuery();

while(resultSet.next()){
%>

<tr bgcolor="#DEB887">
<input type="checkbox" value="check"> <%=resultSet.getString("userName") %>

</tr>

<%
count++;
}

} catch (Exception e) {
e.printStackTrace();
}
%>

<a href="/UserValidation/jsp/delete.jsp"><input type="submit" value="submit"></a>



</f:view>
</body>
</html>