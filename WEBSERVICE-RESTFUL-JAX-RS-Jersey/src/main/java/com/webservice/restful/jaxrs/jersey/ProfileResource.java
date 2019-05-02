package com.webservice.restful.jaxrs.jersey;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.webservice.restful.jaxrs.jersey.exception.ErrorMessages;
import com.webservice.restful.jaxrs.jersey.model.Profile;

@Path("/profile")
public class ProfileResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{profileId}")
	public Profile getMessage(@PathParam("profileId") int id){
		Profile profile=new Profile(1,"manjit","Singh",new Date("11/11/2018"));
			if(id!=1) {
				ErrorMessages error=new ErrorMessages("Not Found...",Status.NOT_FOUND.getStatusCode(),"https://github.com/manjitwaikhom/RESTFUL-WEB-SERVICES-JAX-RS-Jersey");
				Response response= Response.status(Status.NOT_FOUND).entity(error).build();
				throw new WebApplicationException(response);
			}	
				return profile;
	}

}
