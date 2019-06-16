package nl.ricardovdheijden.playlistmanagerapi.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/health")
@Component
public class Health {

    @GET
    @Produces({ MediaType.TEXT_PLAIN })
    public String getHealth() {
        return "API is available";
    }
}
