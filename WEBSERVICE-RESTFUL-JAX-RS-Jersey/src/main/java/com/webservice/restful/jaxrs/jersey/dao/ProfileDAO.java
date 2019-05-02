package com.webservice.restful.jaxrs.jersey.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.webservice.restful.jaxrs.jersey.model.Profile;

public class ProfileDAO {
	
	//dummy data
		public static List<Profile> profiles=new ArrayList<>();
		
		public static Profile profile0 = new Profile(0, "Nobody", "Nobody",new Date("1/12/1980"));
		public static Profile profile1 = new Profile(1, "Manjit", "Manjit", new Date("1/12/1981"));
		public static Profile profile2 = new Profile(2, "Singh", "Singh", new Date("13/12/1982"));
		public static Profile profile3 = new Profile(3, "Waikhom","Waikhom", new Date("15/12/1983"));
		public static Profile profile4 = new Profile(3, "Abhishek", "Abhishek",new Date("15/12/1984"));
		
		static{
			profiles.add(profile0);
			profiles.add(profile1);
			profiles.add(profile2);
			profiles.add(profile3);
			profiles.add(profile4);
		}
		
		
		public static List<Profile> getAllProfiles() {
			return profiles;
		}
		
		public static Profile getProfile(int id){
			return  profiles.get(id);
		}

}
