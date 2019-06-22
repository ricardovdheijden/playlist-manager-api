package nl.ricardovdheijden.playlistmanagerapi.resource;

import nl.ricardovdheijden.playlistmanagerapi.models.ApiHealthStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/health")
@Component
public class Health {

    @Value("${playlist-manager-api.allowed-origins}")
    private String allowedOrigins;

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getHealth() {
        ApiHealthStatus jsonResponse = ApiHealthStatus.builder()
                .message("API is available")
                .available(true)
                .build();

        return Response.ok()
                .entity(jsonResponse)
                .header("Access-Control-Allow-Origin", allowedOrigins)
                .build();
    }
}