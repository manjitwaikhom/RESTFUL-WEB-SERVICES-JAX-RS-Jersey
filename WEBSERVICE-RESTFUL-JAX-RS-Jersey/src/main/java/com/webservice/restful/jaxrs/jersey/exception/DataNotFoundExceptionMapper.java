package com.webservice.restful.jaxrs.jersey.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException exception) {
		ErrorMessages error=new ErrorMessages(exception.getMessage(),Status.NOT_FOUND.getStatusCode(),"https://github.com/manjitwaikhom/RESTFUL-WEB-SERVICES-JAX-RS-Jersey");
		return Response.status(Status.NOT_FOUND).entity(error).build();
	}

}
