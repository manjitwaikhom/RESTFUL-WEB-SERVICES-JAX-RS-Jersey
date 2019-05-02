package com.webservice.restful.jaxrs.jersey.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessages error=new ErrorMessages(exception.getMessage(),Status.INTERNAL_SERVER_ERROR.getStatusCode(),"https://www.youtube.com/watch?v=9oeJc_VkZxo&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn&index=27");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
	}

}
