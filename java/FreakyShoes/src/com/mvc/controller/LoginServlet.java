package com.mvc.controller;

import java.io.IOException;
import com.mvc.bean.LoginBean;
import com.mvc.dao.LOginDao;
import com.mvc.dao.LoginJdbc;

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
	 
	   LoginJdbc jdbc = new LoginJdbc();
	   String userValidate = jdbc.authenticateUser(loginBean);
		if(userValidate.equals("SUCCESS")) 
		 {
		 request.setAttribute("userName", userName); 
		 request.getRequestDispatcher("/jsp/Home.jsp").forward(request, response);
		 }
		 else
		 {
		 request.setAttribute("errMessage", userValidate); 
		 request.getRequestDispatcher("/Login.jsp").forward(request, response);
		 }
	 
	/*LOginDao loginDao = new LOginDao(); 
	String userValidate2 = loginDao.authenticateUser(loginBean);
	if(userValidate.equals("SUCCESS")) 
	 {
	 request.setAttribute("userName", userName); 
	 request.getRequestDispatcher("/jsp/Home.jsp").forward(request, response);
	 }
	 else
	 {
	 request.setAttribute("errMessage", userValidate); 
	 request.getRequestDispatcher("/Login.jsp").forward(request, response);
	 }
	 }
	 */
	}

}