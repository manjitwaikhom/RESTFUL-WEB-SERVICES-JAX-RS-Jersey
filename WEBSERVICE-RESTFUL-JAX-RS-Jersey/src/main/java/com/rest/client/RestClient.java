package com.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import com.webservice.restful.jaxrs.jersey.model.Message;

public class RestClient {

    public static void main(String[] args) {
	Client client=ClientBuilder.newClient();
	String uri="http://localhost:8080/WEBSERVICE-RESTFUL-JAX-RS-Jersey/messageapi/messages/1";
	Response response=client.target(uri).request().get();
	Message message=response.readEntity(Message.class);
	System.out.println(message.getMessage());
	
    }

}
