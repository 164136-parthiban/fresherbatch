package com.parthi.country.resorces;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.parthi.country.dao.CountryDao;
import com.parthi.country.list.CountryList;

@Path("/mycountry")
public class Country 
{
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public CountryDao getCountry(@FormParam("code") long zipcode)
	{
		CountryList list = new CountryList();
		
		for (CountryDao dao : list.list())
		{
			if(zipcode==dao.getZipCode())
			{
				return dao;
		  
			}
        }
		return null;
	
	}

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{code}")
	public CountryDao getCountry2(@PathParam("code") long zipcode)
	{
		CountryList list = new CountryList();
		
		for (CountryDao dao : list.list())
		{
			if(zipcode==dao.getZipCode())
			{
				return dao;
		  
			}
        }
		return null;
	
	}
}
