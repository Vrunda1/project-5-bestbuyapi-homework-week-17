package localhost.swagger.products;

import io.restassured.response.Response;
import localhost.swagger.model.ProductsPojo;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ProductsPatch extends TestBaseStores {
    @Test
    public void updateProduct() {
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("Duracell - AAA Batteries (2-Pack)");
       productsPojo.setType("HardGood");
        productsPojo.setPrice(5.99);
        productsPojo.setUpc("041333424019");
        productsPojo.setShipping(0);
        productsPojo.setDescription("Compatible with select electronic devices; AAA size; DURALOCK Power Preserve technology; 4-pack");
        productsPojo.setManufacturer("Duracell");
        productsPojo.setModel("MN2400B4A");
        productsPojo.setUrl("This is url for Duracell battery Pro");
        productsPojo.setImage("This is image for Duracell pack");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productsPojo)
                .when()
                .patch("/products/48530");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}




