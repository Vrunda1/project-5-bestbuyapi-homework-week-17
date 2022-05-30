package localhost.swagger.products;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ProductsGet extends TestBaseStores {
    @Test
    public void getProductId() {
        Response response = given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
