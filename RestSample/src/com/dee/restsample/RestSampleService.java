package com.dee.restsample;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("RestService")
public class RestSampleService {
@GET
@Path("/CtoF/{i}")
@Produces(MediaType.TEXT_XML)
public String cToF(@PathParam("i") int a)
{
	System.out.println("entering the service");
	return "<result>"+a*100 + "</result>";
}

}
