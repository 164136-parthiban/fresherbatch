<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="/FreakyShoe/CSS/header.css">
<title>HOMEPAGE</title>
</head>
<body>


<div class="topnav">

  <h1 style="float: left;" ><span ><img src="/FreakyShoe/images/logo.jpg" width="100" height="40"></span></h1>
  
  <a class="active" href="home.jsp" style="color:white">Home</a>
  <a href="/FreakyShoe/jsp/login.jsp" style="color:white">Login</a>
  <a href="/FreakyShoe/jsp/cart.jsp" style="color:white">Cart</a>
 
  <div class="search-container">
   
    <form action="/FreakyShoe/search">
    
      <input type="text" placeholder="Search.." name="search">
      
      
    </form>
    
 </div>
 
</div>

</body>
</html>