package com.webservice.restful.jaxrs.jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

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
	public List<Message> getAllMessages() {
		return messageService.getAllMesssages();
	}
	
	@GET
	@Path("/year")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessagesByYear(@QueryParam("year") int year){
		if(year>0) {
		return messageService.getAllMesssagesByYear(year);
		}
		return messageService.getAllMesssages();
	}
	
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/pagination")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessagesPagination(@QueryParam("start") int start, @QueryParam("size") int size) {
		return messageService.getAllMesssagesPagination(start, size);
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
	
	//Accessing header param
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/customheader")
	public String getHeaderParam(@HeaderParam("customHeader") String customHeader) {
		return customHeader;
	}
	
	//Accessing cookie param
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/cookie")
	public String getCookieParam(@CookieParam("name") String cookieValue) {
		return cookieValue;
	}
	
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/context")
	public String getParamsContext(@Context UriInfo uriInfo,@Context HttpHeaders headers) {
		String path=uriInfo.getAbsolutePath().toString();
		String cookies=headers.getCookies().toString();
		return cookies;
	}
	
	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageid}/comments")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}
	
	
	

}
