package nl.ricardovdheijden.playlistmanagerapi.resource;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HealthResourceIT extends AbstractIT {

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    void test_getHealth() {
        givenDefaultHeaders()
                .get("/health")
                .then()
                .statusCode(HttpStatus.OK.value())
                .header("Access-Control-Allow-Origin", is("http://localhost:3000"))
                .body("message", equalTo("API is available"))
                .body("available", equalTo(true));
    }
}
