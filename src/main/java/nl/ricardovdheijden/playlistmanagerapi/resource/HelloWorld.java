package nl.ricardovdheijden.playlistmanagerapi.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
@Component
public class HelloWorld {

    @GET
    @Produces({ MediaType.TEXT_PLAIN })
    public String getHealth() {
        return "API is available";
    }
}
