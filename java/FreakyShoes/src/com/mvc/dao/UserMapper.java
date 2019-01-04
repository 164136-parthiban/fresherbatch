package com.mvc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.mvc.bean.LoginBean;


public class UserMapper implements RowMapper<LoginBean>
{

	@Override
	public LoginBean mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName(rs.getString("UNAME"));
		loginBean.setPassword(rs.getString("Pass"));
		
		return loginBean;
	}

}
