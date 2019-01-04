package com.mvc.controller;

import java.io.IOException;
import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	public LoginServlet() {
	 }
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	
	 
	String userName = request.getParameter("username");
	 String password = request.getParameter("password");
	 
	LoginBean loginBean = new LoginBean(); 
	 
	loginBean.setUserName(userName); 
	 loginBean.setPassword(password);
	 
	LoginDao loginDao = new LoginDao(); 
	String userValidate = loginDao.authenticateUser(loginBean);
	if(userValidate.equals("SUCCESS")) 
	 {
	 request.setAttribute("userName", userName); 
	 request.getRequestDispatcher("/jsp/home2.jsp").forward(request, response);
	 }
	 else
	 {
	 request.setAttribute("errMessage", userValidate); 
	 request.getRequestDispatcher("/Login.jsp").forward(request, response);
	 }
	 }
	 
	}

