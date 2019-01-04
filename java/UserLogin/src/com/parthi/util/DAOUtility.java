package com.parthi.util;

import com.parthi.dao.IUserDAO;
import com.parthi.dao.UserDAO;


public class DAOUtility 
{

	public static IUserDAO getUserDAO()
	{
		return new UserDAO();
	}
}
