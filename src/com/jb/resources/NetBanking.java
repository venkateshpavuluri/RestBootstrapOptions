package com.jb.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
/**
 * 
 * @author Venkatesh
 *
 */
@Path("/banking")
public class NetBanking {
	
	@QueryParam("accno")
	private String accno;
	@GET
	@Path("balance")
	@Produces(MediaType.TEXT_PLAIN)
public String balance() {
	return "Balance iss==="+this.hashCode();
	
}
}
