package localhost.swagger.categories;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class CategoriesGetId extends TestBaseStores {
    @Test
    public void getCategoriesId() {
        Response response = given()
                .pathParam("id","abcat0010000")
                .when()
                .get("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
