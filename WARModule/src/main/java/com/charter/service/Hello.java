package com.charter.service;

import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.JARModule.HelloBean;
@Path("service")
public class Hello{
	
	@EJB
	HelloBean bean;
	

	@DenyAll
	@GET
    @Path("/test")
	@Produces(MediaType.APPLICATION_XML)
	public String sayHello() {
		
		return bean.sayHello();
	}

}
