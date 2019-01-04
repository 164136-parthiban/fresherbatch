package com.parthi.util;

import com.parthi.dao.IUserDAO;
import com.parthi.dao.UserDAO;
import com.parthi.dao.UserDAOVer2;

public class DAOUtility 
{

	public static IUserDAO getUserDAO()
	{
		return new UserDAOVer2();
	}
}
