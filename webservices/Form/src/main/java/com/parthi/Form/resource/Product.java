package com.parthi.Form.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/product")
public class Product{
 	@POST
 	@Path("/add")
 	/*@Produces(MediaType.APPLICATION_JSON)*/
	public Response addUser(
		@FormParam("id") int id,
		@FormParam("name") String name,
		@FormParam("price") float price) {
 
		return Response.status(200)
			.entity(" Product added successfuly!"+"\n Id: "+id+"\n Name: " + name+"\n Price: "+price)
			.build();
 	}
}