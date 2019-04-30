package com.webservice.restful.jaxrs.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class CommentResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllComments() { 
		return "nicee..."; 
		}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{commentId}")
	public String getCommentById(@PathParam("messageid") int messageId,@PathParam("commentId") int commentId) { 
		return "nicee..."+" Message ID:  "+messageId+"Comment ID: "+commentId; 
		}

}
