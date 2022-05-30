package localhost.swagger.services;

import io.restassured.response.Response;
import localhost.swagger.model.ServicesPojo;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ServicesPost extends TestBaseStores {
    @Test
    public void createServices() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Mobile Repairing");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();



    }
}
