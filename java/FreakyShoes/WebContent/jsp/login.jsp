<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/Registration/CSS/home.css">
<title>Login</title>

<script> 
function validate()
{ 
 var username = document.form.username.value; 
 var password = document.form.password.value;
 
 if (username==null || username=="")
 { 
 alert("Username cannot be blank"); 
 return false; 
 }
 else if(password==null || password=="")
 { 
 alert("Password cannot be blank"); 
 return false; 
 } 
}
</script>
 
</head>
<body background="/Registration/images/background.jpg">

<form name="form" action="/Registration/LoginServlet" method="post" onsubmit="return validate()">
<table align="center">
 <tr>
 <td>Username</td>
 <td><input type="text" name="username" /></td>
 </tr>
 <tr>
 <td>Password</td>
 <td><input type="password" name="password" /></td>
 </tr>
 <tr> 
 <td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%></span></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" value="Login"></input><input
 type="reset" value="Reset"></input></td>
 </tr>
  <tr>
  <td colspan="1" > <a href="/Registration/jsp/Register.jsp">Register Here</a></td>
 </tr>
</table>
</form>
 
</body>
</html>