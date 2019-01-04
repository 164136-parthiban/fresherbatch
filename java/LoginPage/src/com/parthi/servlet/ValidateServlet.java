package com.parthi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.parthi.dao.IUserDAO;
import com.parthi.dao.UserDAO;
import com.parthi.util.DAOUtility;


@WebServlet("/validate")

public class ValidateServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String userName,password;
		
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		String userType="invalid";
		
		userType = getUserType(userName, password);
		
		RequestDispatcher requestDispatcher = null;
		
		if(userType.equals("Admin"))
		{
		  requestDispatcher = request.getRequestDispatcher("/jsp/adminjsp.jsp");	
		}
		else if(userType.equals("User"))
		{
			requestDispatcher = request.getRequestDispatcher("/jsp/user.jsp");	
		}
		else
		{
			requestDispatcher = request.getRequestDispatcher("/invalid");	
		}
		
		requestDispatcher.forward(request, response);
		
		
	}

	private String getUserType(String userName, String password)
	{
		IUserDAO dao=DAOUtility.getUserDAO();
		return dao.getUserType(userName, password);
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		doGet(request, response);
		
	}

}
