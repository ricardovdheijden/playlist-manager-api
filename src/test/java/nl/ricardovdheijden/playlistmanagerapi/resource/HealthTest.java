package nl.ricardovdheijden.playlistmanagerapi.resource;

import nl.ricardovdheijden.playlistmanagerapi.models.ApiHealthStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class HealthTest {

    @InjectMocks
    private Health health;

    @Test
    public void test_getHealth() {
        Response response = health.getHealth();
        ApiHealthStatus apiHealthStatus = (ApiHealthStatus) response.getEntity();

        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus(), "Invalid status code");
        assertTrue(apiHealthStatus.isAvailable(), "Should be available");
        assertEquals("API is available", apiHealthStatus.getMessage(), "Invalid message");
    }
}
