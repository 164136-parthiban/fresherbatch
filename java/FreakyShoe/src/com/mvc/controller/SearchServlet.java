package com.mvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.ProductBean;
import com.mvc.dao.LoginDao;
import com.mvc.dao.SearchDao;
import com.mvc.util.DBConnection;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
		String productName=request.getParameter("search");
	    ProductBean productBean = new ProductBean();
	    
	    productBean.setProductName(productName);
	    SearchDao productDao = new SearchDao(); 
	
	    String productValidate = productDao.authenticateProduct(productBean);
	    
	    if(productValidate!="Invalid ")
	    {
	     request.setAttribute("productName", productName); 
	   	 request.getRequestDispatcher("/jsp/cart.jsp").forward(request, response);
	    }
	    else
		 {
		 request.setAttribute("errMessage", productValidate); 
		 request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		 }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		doGet(request, response);
	}

}
