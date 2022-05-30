package localhost.swagger.services;

import io.restassured.response.Response;
import localhost.swagger.model.ServicesPojo;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ServicesPatch extends TestBaseStores {
    @Test
    public void updateServices() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Laptop Repairing");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .pathParam("id",23)
                .when()
                .patch("/services/{id}");
        response.prettyPrint();
        response.then().statusCode(200);



    }
}
