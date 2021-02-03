package com.example.ap.mongodriver.api.interfaces;

import static com.example.ap.mongodriver.api.interfaces.TodoInterface.BASE_PATH;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.ap.mongodriver.commons.Constants.HTTPRequestConstants;
import com.example.ap.mongodriver.commons.exception.StandardException;
import com.example.ap.mongodriver.domain.Todo;

@Path(BASE_PATH)
@Produces(HTTPRequestConstants.JSON_MEDIA_TYPE)
@Consumes(HTTPRequestConstants.JSON_MEDIA_TYPE)
public interface TodoInterface {
    String BASE_PATH = "/v1/todo";

    @GET
    @Path("/")
    List<Todo> getAllTodo();

    @POST
    @Path("/")
    Todo createTodo(@RequestBody Todo todo);

    @GET
    @Path("/{id}")
    Todo getTodoById(@PathParam("id") String id) throws StandardException;

    @PUT
    @Path("/{id}")
    Todo updateTodo(@PathParam("id") String id, @RequestBody Todo todo);
}
