
package com.cxf.server.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public interface HelloService {
    @GET
    @Path("/{a}")
    String sayHello(@PathParam("a") String a);
}
