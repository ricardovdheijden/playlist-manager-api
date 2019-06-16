package nl.ricardovdheijden.playlistmanagerapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PlaylistManagerApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
        new PlaylistManagerApiApplication()
                .configure(new SpringApplicationBuilder(PlaylistManagerApiApplication.class))
                .run(args);
	}

}
