package nl.ricardovdheijden.playlistmanagerapi.configuration;

import nl.ricardovdheijden.playlistmanagerapi.resource.Health;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(Health.class);
    }
}
