<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.parthi.dao.ConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parthi Website</title>
</head>
<body>
<f:view>

<% String[] del =request.getParameterValues("check"); %>
<% String userName =request.getParameter("userName"); %>

<%
Connection connection=ConnectionFactory.getConnection();

try{ 
	for(int index=0;index<del.length;index++)
	{
		if(del[index]!=null)
		{
			PreparedStatement statement =connection.prepareStatement("select * from userTable where userName = ? and password = ?");
			statement.setString(1, userName);
			statement.executeUpdate();
       }
	}
}

catch (Exception e) 
{
e.printStackTrace();
}


%>

<%
try{ 
	PreparedStatement statement =connection.prepareStatement("select * from userTable");

   ResultSet resultSet = statement.executeQuery();

while(resultSet.next()){
%>
 <tr>
 <%=resultSet.getString("userName") %>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>

</f:view>
</body>
</html>