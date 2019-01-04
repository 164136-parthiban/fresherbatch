package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;
 
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;

public RegisterServlet() {
 }
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 //Copying all the input parameters in to local variables
 String firstName = request.getParameter("firstname");
 String lastName = request.getParameter("lastname");
 String email = request.getParameter("email");
 String userName = request.getParameter("username");
 String password = request.getParameter("password");
 
 RegisterBean registerBean = new RegisterBean();
 
 registerBean.setFirstName(firstName);
 registerBean.setLastName(lastName);
 registerBean.setEmail(email);
 registerBean.setUserName(userName);
 registerBean.setPassword(password); 
 
 RegisterDao registerDao = new RegisterDao();
 

 String userRegistered = registerDao.registerUser(registerBean);
 
 if(userRegistered.equals("SUCCESS"))   
 {
 request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
 }
 else   
 {
 request.setAttribute("errMessage", userRegistered);
 request.getRequestDispatcher("/register.jsp").forward(request, response);
 }
 }
}