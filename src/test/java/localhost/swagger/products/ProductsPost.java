package localhost.swagger.products;

import io.restassured.response.Response;
import localhost.swagger.model.ProductsPojo;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ProductsPost extends TestBaseStores {
    @Test
    public void createProduct() {
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("Duracell - AAA Batteries (4-Pack)");
       productsPojo.setType("HardGood");
        productsPojo.setPrice(7.99);
        productsPojo.setUpc("041333424019");
        productsPojo.setShipping(0);
        productsPojo.setDescription("Compatible with select electronic devices; AAA size; DURALOCK Power Preserve technology; 4-pack");
        productsPojo.setManufacturer("Duracell");
        productsPojo.setModel("MN2400B4Z");
        productsPojo.setUrl("This is url for Duracell battery Pro");
        productsPojo.setImage("This is image for Duracell pack");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productsPojo)
                .when()
                .post("/products");
        response.prettyPrint();
        response.then().statusCode(201);

    }
}




