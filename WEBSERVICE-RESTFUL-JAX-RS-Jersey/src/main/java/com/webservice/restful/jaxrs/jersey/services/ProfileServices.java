package com.webservice.restful.jaxrs.jersey.services;

import java.util.List;

import com.webservice.restful.jaxrs.jersey.dao.ProfileDAO;
import com.webservice.restful.jaxrs.jersey.model.Profile;

public class ProfileServices {

	public List<Profile> getAllProfiles() {
		  return ProfileDAO.getAllProfiles();
		  }
	
	public Profile getProfile(int id) {
		  return ProfileDAO.getProfile(id);
		  }
}
