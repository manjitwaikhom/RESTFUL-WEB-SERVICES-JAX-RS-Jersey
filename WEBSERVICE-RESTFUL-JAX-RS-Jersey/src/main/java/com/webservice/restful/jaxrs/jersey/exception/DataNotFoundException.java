package com.webservice.restful.jaxrs.jersey.exception;

public class DataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 177L;
	
	String message;

	public DataNotFoundException(String message) {
		super(message);
	}
	
	

}
