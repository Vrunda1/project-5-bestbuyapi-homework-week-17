package localhost.swagger.categories;

import io.restassured.response.Response;
import localhost.swagger.model.CategoriesPojo;
import localhost.swagger.model.ServicesPojo;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class CategoriesPatch extends TestBaseStores {
    @Test
    public void updateCategories() {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setId("pcrcat84000050012");
        categoriesPojo.setName("Bollywood Parties");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .patch("/categories");
        response.prettyPrint();
        response.then().statusCode(200);




    }
}
