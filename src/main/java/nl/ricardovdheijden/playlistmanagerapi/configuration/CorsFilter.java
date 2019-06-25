package nl.ricardovdheijden.playlistmanagerapi.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
@Component
public class CorsFilter implements ContainerResponseFilter {

    @Value("${playlist-manager-api.allowed-origin}")
    private String allowedOrigin;

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        responseContext.getHeaders().add("Access-Control-Allow-Origin", allowedOrigin);
    }
}

