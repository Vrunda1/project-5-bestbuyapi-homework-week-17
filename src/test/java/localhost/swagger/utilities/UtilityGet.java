package localhost.swagger.utilities;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class UtilityGet extends TestBaseStores {
    @Test
    public void getUtilityVersion() {
        Response response = given()
                .when()
                .get("/version");
        response.prettyPrint();
        response.then().statusCode(200);



    }
}
