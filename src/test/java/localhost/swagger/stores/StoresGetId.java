package localhost.swagger.stores;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StoresGetId extends TestBaseStores {
    @Test
    public void getStoreId() {
        Response response = given()
                .when()
                .get("/stores/8922");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
