package localhost.swagger.services;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ServicesDelete extends TestBaseStores {
    @Test
    public void servicesDelete() {


       Response response = given()
                .header("Content-Type", "application/json")
               .pathParam("id",11)
                .when()
                .delete("/services/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
