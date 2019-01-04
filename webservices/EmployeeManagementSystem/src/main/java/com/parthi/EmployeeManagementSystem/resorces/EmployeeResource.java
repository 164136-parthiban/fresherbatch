package com.parthi.EmployeeManagementSystem.resorces;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.parthi.EmployeeManagementSystem.model.Employee;
import com.parthi.EmployeeManagementSystem.repository.EmployeeRepository;
import com.parthi.EmployeeManagementSystem.services.EmployeeServiceImpl;


@Path("/emp")
public class EmployeeResource 
{
	 EmployeeServiceImpl service =new EmployeeServiceImpl();
	 

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> get()
	{
     return service.get(); 
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmp(@PathParam("id") long id)
	{
     return service.getEmployee(id); 
	}
	
	
    @DELETE
	@Path("/del/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> delEmp(@PathParam("id") long id)
	{
    	return service.deleteEmployee(id);
	}
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> addEmp(Employee e)
	{
     return service.addEmployee(e);
	}
	
	@PUT
	@Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updateEmp(@PathParam("id") long id,Employee e)
	{
	 e.setEmployeeId(id);
     return service.updateEmployee(id,e);
	}
}
