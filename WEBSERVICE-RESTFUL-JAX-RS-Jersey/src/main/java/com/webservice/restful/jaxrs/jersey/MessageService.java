package com.webservice.restful.jaxrs.jersey;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageService {
	
	Map<Integer,Message> dummyDatabase=MessagesDAO.getMessages();
    List<Message> messageList;
	
	Message msg1 = new Message(1, "Hello Manjit!!", new Date("1/12/1987"), "Manjit");
	Message msg2 = new Message(2, "Hello Singh!!", new Date("13/12/1987"), "Singh");
	Message msg3 = new Message(3, "Hello Waikhom!!", new Date("15/12/1987"), "Waikhom");
	
	{
		dummyDatabase.put(1, msg1);
		dummyDatabase.put(2, msg2);
		dummyDatabase.put(3, msg3);
		
		
		messageList = new ArrayList<Message>(dummyDatabase.values());
	}
	
	  public List<Message> getAllMesssages() {
	  return new ArrayList<Message>(dummyDatabase.values()); 
	  }
	  
	  
	  public Message getMesssage(int id) {
		  return dummyDatabase.get(id); 
		  }
	  
	  public Message addMesssage(Message msg) {
		  if(msg.getId()<=0) {return null;}
		  return dummyDatabase.put(msg.getId(), msg);
		  }
	  
	  public Message updateMesssage(Message msg) {
		  if(msg.getId()<=0) {return null;}
		  return dummyDatabase.put(msg.getId(), msg);
		  }
	  public Message removeMesssage(long id) {
		  return dummyDatabase.remove(id) ;
		  }
	 

}
