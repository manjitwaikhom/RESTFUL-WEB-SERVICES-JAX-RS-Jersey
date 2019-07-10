package com.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.webservice.restful.jaxrs.jersey.model.Message;

public class RestClient {

    public static void main(String[] args) {
	Client client=ClientBuilder.newClient();
	WebTarget baseTarget=client.target("http://localhost:8080/WEBSERVICE-RESTFUL-JAX-RS-Jersey/messageapi/");
	WebTarget messageTarget = baseTarget.path("messages");
	WebTarget singleMessageTarget = messageTarget.path("{messageId}");
	
	Message message1=singleMessageTarget.resolveTemplate("messageId", "1").request().get(Message.class);
	System.out.println(message1.getMessage());
	
	Message message2=singleMessageTarget.resolveTemplate("messageId", "2").request().get(Message.class);
	System.out.println(message2.getMessage());
	
	/*String uri="http://localhost:8080/WEBSERVICE-RESTFUL-JAX-RS-Jersey/messageapi/messages/1";
	Response response=client.target(uri).request().get();
	Message message=response.readEntity(Message.class);
	System.out.println(message.getMessage());*/
	
    }

}
