package localhost.swagger.products;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ProductsDelete extends TestBaseStores {
    @Test
    public void deleteProductId() {
        Response response = given()
                .pathParam("id",127687)
                .when()
                .delete("/products/{id}");
        response.prettyPrint();
        System.out.println("Product id 127687 is deleted");
        response.then().statusCode(200);

    }
}
