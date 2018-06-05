package com.javaeeeee.hellodropwizard.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;
import redis.clients.jedis.Jedis;


@Path("/redis")
@Produces(MediaType.TEXT_HTML)
public class redisResource {
	
	
	@GET
	public String redisReturn(@QueryParam("name") String name) {
		Jedis jedis= new Jedis("localhost");
		if (jedis.exists(name)) {
			return ("Hello "+name);
		}
		else
			return "User not found";
	}
	
	@POST
	public void redisAdd(@FormParam("name") String name, @FormParam("age") String age) {
		Jedis jedis= new Jedis("localhost");
		jedis.set(name, age);
	}

}
