package org.acme;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("person")
public class PersonResource {
    
    @GET
    public List<Person> list() {
        return Person.listAll();
    }

    @POST
    public Response create(Person person) {
        person.persist();
        return Response.status(201).build();
    }
}
