package com.webservice.restful.jaxrs.jersey;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
	
	  public List<Message> getAllMesssages() {
	  return MessagesDAO.getMessages();
	  }
	  
	  public List<Message> getAllMesssagesByYear(int year) {
		  List<Message> allMessages= MessagesDAO.getMessages();
		  List<Message> messagesListFilteredByYear=new ArrayList<>();
		  for(Message msg:allMessages) {
			 if((1900+ msg.getDate().getYear())==year) {
				 messagesListFilteredByYear.add(msg);
			 }
		  }
		  return messagesListFilteredByYear;
		  }
	  
	  public List<Message> getAllMesssagesPagination(int start, int size) {
		  List<Message> allMessages= MessagesDAO.getMessages();
		  List<Message> paginatedMessages=new ArrayList<>();
		  for(int i=start;i<=size;i++) {
			  paginatedMessages.add(allMessages.get(i));
		  }
		  return paginatedMessages;
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
