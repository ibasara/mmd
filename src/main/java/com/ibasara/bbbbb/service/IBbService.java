package com.ibasara.bbbbb.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bb")
public interface IBbService {

	@POST
	@Path("/cc")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_FORM_URLENCODED})
	public String methodb();
	
}
