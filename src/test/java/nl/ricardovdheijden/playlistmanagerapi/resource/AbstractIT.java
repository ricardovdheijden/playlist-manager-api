package nl.ricardovdheijden.playlistmanagerapi.resource;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;

public abstract class AbstractIT {

    @LocalServerPort
    private int port;

    public void setUp() throws Exception {
        RestAssured.port = port;
        RestAssured.baseURI = "http://localhost";
        RestAssured.defaultParser = Parser.JSON;
    }

    RequestSpecification givenDefaultHeaders() {
        return given().header("Content-Type", "application/json");
    }
}
