package com.parthi.dao;

import com.parthi.pojo.User;

public interface IUserDAO
{
	public String getUserType(String userName, String password);
	public void addUser(User user);
	public void ChangePassword(String userName, String oldPassword, String newPassword);
	public void removeUser(String userName);

}
