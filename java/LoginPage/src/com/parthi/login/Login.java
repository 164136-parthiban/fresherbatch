package com.parthi.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(description = "login page", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String name=request.getParameter("userName");  
		String password=request.getParameter("userPass");  
		String email=request.getParameter("userEmail");  
		String country=request.getParameter("userCountry");  
		          
		
		
		out.println("<!DOCTYPE html>  <html> <head> <title>Application form</title>");
		out.println("<style>");
		out.println("table, th, td, tr {border: 1px solid black}");
		out.println("</style>");
		out.println("</head><body>");
		out.println("<table >");
		out.println("<tr><th>Name :</th>");
		out.println("<td>" + name +"</td></tr>");
		out.println("<tr><th>Email :</th>");
		out.println("<td>" + email +"</td></tr>");
		out.println("<tr><th>Country :</th>");
		out.println("<td>" + country +"</td></tr>");
		out.println("</table>");
		out.println("</body> </html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
