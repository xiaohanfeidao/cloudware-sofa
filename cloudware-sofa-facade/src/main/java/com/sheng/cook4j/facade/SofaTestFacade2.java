package com.sheng.cook4j.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sheng.cook4j.data.SofaData;

@Path("/webapi/rest")
@Consumes("application/json;charset=UTF-8")
@Produces("application/json;charset=UTF-8")
public interface SofaTestFacade2 {

	@GET
    @Path("/doSofa/{id}/{name}/{desc}")
	SofaData doSofa(@PathParam("id") Long id,
			@PathParam("name") String name,
			@PathParam("desc") String desc);
	@POST
	@Path("/doSofa2")
	int doSofa(SofaData data);
}
