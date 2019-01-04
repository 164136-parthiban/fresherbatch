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


@WebServlet(description = "welcome page", urlPatterns = { "/welcome" })
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();
	      
	      HttpSession session=request.getSession(false);
	      
	      String myName=(String)session.getAttribute("name");
	      String myEmail=(String)session.getAttribute("email");
	
	      pwriter.println("<p>Using Session</p>");
	      
	      pwriter.println("<p>");
	      
	      pwriter.print("Name: "+myName+"<br>   Email: "+myEmail);
	      
	      pwriter.println("</p>");
	      //Reading cookies
	       Cookie c[]=request.getCookies(); 
	       
	       pwriter.println("<p>Using Cookies</p>");
	       
	       //Displaying User name value from cookie
	       pwriter.println("<p>");
	       
	       pwriter.print("Name: "+c[0].getValue()); 
	       
	       pwriter.println("</p>");
	       
	       //Displaying user password value from cookie
	       pwriter.println("<p>");
	       
	       pwriter.print("Email: "+c[1].getValue());
	       
	       pwriter.println("</p>");
	      
	      pwriter.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
