package com.webservice.restful.jaxrs.jersey;

import java.util.HashMap;
import java.util.Map;

public class MessagesDAO {
	
	public static Map<Integer,Message> messages=new HashMap<>();
	public static Map<Integer,Message> profiles=new HashMap<>();
	
	public static Map<Integer,Message> getMessages() {
		return messages;
	}
	
	
	public static Map<Integer,Message> getProfiles() {
		return profiles;
	}

}
