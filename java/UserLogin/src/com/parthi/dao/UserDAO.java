package com.parthi.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.ws.Response;

import com.parthi.pojo.User;

public class UserDAO implements IUserDAO
{



@Override
public void addUser(User user) 
	{
	Connection connection=ConnectionFactory.getConnection();
    try 
    {
		PreparedStatement statement =connection.prepareStatement("insert into userTable values(? , ?, User)");
		statement.setString(1, user.getUserName());
		statement.setString(2, user.getPassword());
		statement.executeQuery();
		int rows=statement.executeUpdate();
		System.out.println(rows);
		
	} 
    catch (SQLException e)
    {
		
		e.printStackTrace();
	}

	
   }

@Override
public String getUserType(String userName, String password)
{
	return null;
	
}

@Override
public void ChangePassword(String userName, String oldPassword, String newPassword) 
{
	
	
}

@Override
public void removeUser(String userName) 
{
	
	
}

}
