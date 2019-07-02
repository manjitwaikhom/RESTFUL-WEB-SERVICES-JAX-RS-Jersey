package com.webservice.restful.jaxrs.jersey;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
//if you use this class you dont need to use web.xml but u must use servlet 3 
@ApplicationPath("messageapi")
public class MyApp extends Application{

}
