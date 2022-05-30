package localhost.swagger.services;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ServicesGetId extends TestBaseStores {
    @Test
    public void getServiceId() {
        Response response = given()
                .pathParam("id",6)
                .when()
                .get("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
