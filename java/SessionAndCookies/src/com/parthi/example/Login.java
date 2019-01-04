package com.parthi.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(description = "login page", urlPatterns = { "/login" })

public class Login extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		  response.setContentType("text/html");
		  
	      PrintWriter pwriter = response.getWriter();

	      String name = request.getParameter("userName");
	      String email = request.getParameter("email");
	      
	      pwriter.println("\n");
	      
	      pwriter.print("Hello "+name);
	      
	      pwriter.println("<p>");
	      
	      pwriter.print("Your Email is: "+email);
	      
	      pwriter.println("</p>");
	      
	      HttpSession session=request.getSession();
	      
	      session.setAttribute("name",name);
	      session.setAttribute("email",email);
	    
	    //Creating two cookies
	      
         Cookie c1=new Cookie("userName",name);
         Cookie c2=new Cookie("email",email);

         //Adding the cookies to response header
         
         response.addCookie(c1);
         response.addCookie(c2);
	      
	     pwriter.print("<br><a href='welcome'>View Details</a>");
	      
	       
	     pwriter.close();
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
