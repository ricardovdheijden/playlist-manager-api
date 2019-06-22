package nl.ricardovdheijden.playlistmanagerapi.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ApiHealthStatus {
    private String message;
    private boolean available;
}
