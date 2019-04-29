package com.webservice.restful.jaxrs.jersey;

import java.util.List;

public class MessageService {
	
	  public List<Message> getAllMesssages() {
	  return MessagesDAO.getMessages();
	  }
	  
	  
	  public Message getMesssage(int id) {
		  return MessagesDAO.getMessage(id);
		  }
	  
	  public Message addMesssage(Message msg) {
		  return MessagesDAO.addMessage(msg);
		  }
	  
	  public Message updateMesssage(Message msg) {
		  return MessagesDAO.updateMessage(msg);
		  }
	  public Message deleteMessage(int id) {
		  return MessagesDAO.deleteMessage(id);
		  }
	 

}
