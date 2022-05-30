package localhost.swagger.stores;

import io.restassured.response.Response;
import localhost.swagger.model.StoresPojo;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StoresDelete extends TestBaseStores {
    @Test
    public void storeDelete() {


       Response response = given()
                .header("Content-Type", "application/json")
               .pathParam("id",4)
                .when()
                .delete("/stores/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
