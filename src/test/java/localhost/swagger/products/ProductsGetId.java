package localhost.swagger.products;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ProductsGetId extends TestBaseStores {
    @Test
    public void getProductId() {
        Response response = given()
                .pathParam("id",43900)
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
