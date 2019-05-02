package com.webservice.restful.jaxrs.jersey.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.webservice.restful.jaxrs.jersey.model.Message;

public class MessagesDAO {
	//dummy data
	public static List<Message> messages=new ArrayList<>();
	
	public static Message msg0 = new Message(0, "Hello Nobody!!", new Date("1/12/1980"), "Nobody");
	public static Message msg1 = new Message(1, "Hello Manjit!!", new Date("1/12/1981"), "Manjit");
	public static Message msg2 = new Message(2, "Hello Singh!!", new Date("13/12/1982"), "Singh");
	public static Message msg3 = new Message(3, "Hello Waikhom!!", new Date("15/12/1983"), "Waikhom");
	public static Message msg4 = new Message(3, "Hello Abhishek!!", new Date("15/12/1984"), "Abhishek");
	
	static{
		messages.add(msg0);
		messages.add(msg1);
		messages.add(msg2);
		messages.add(msg3);
		messages.add(msg4);
	}
	
	
	public static List<Message> getMessages() {
		return messages;
	}
	
	public static Message getMessage(int id)throws Exception {
		return  messages.get(id);
	}
	
	public static Message addMessage(Message message) {
		int idx=messages.size();
		message.setId(idx);
		 boolean status=messages.add(message);
		 if(status) {return message;}else return null;
		 
	}
	
	public static Message updateMessage(Message message) {
		int id=message.getId();
		Message status=messages.set(id,message);
		 if(status!=null) {return message;}else return null;
	}
	
	public static Message deleteMessage(int id) {
		return messages.remove(id);
	}
	

}
