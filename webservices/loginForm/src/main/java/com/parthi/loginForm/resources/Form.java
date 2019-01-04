package com.parthi.loginForm.resources;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myform")
public class Form {
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String validate(@FormParam("userName") String username,
			@FormParam("password") String password)
	{
		System.out.println(username+ " " +password);
		if(username.equals("parthi")&&password.equals("parthi123"))
		{
		return "Welcome User!!";
		}
		else
		{
		return "invalid user!!";
		}
	}

}
