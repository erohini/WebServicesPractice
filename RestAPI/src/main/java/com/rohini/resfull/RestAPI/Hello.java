package com.rohini.resfull.RestAPI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Text_Hello(){
		return "Hello";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String XML_Hello(){
		return "<?xml version=\"1.0\"?>" + "<hello> Hello " + "</hello>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String HTML_Hello(){
		return "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	}
	
}
