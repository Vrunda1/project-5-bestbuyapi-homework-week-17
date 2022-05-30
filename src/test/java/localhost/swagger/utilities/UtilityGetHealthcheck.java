package localhost.swagger.utilities;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class UtilityGetHealthcheck extends TestBaseStores {
    @Test
    public void getUtilityHealthcheck() {
        Response response = given()
                .when()
                .get("/healthcheck");
        response.prettyPrint();
        response.then().statusCode(200);



    }
}
