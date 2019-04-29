package com.webservice.restful.jaxrs.jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessagesResource {
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String getMessages() { return
	 * " Hi Manjit"; }
	 */
	
	MessageService messageService=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages(){
		return messageService.getAllMesssages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") int id){
		return messageService.getMesssage(id);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message saveMessages(Message msg) {
		return messageService.addMesssage(msg);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message deleteMessage(@PathParam("messageId") int id) {
		Message deletedMessage=messageService.deleteMessage(id);
		return deletedMessage;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessages(Message msg) {
		return messageService.updateMesssage(msg);
	}
	
	
	

}
