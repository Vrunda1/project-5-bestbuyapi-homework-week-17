package localhost.swagger.categories;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class CategoriesGet extends TestBaseStores {
    @Test
    public void getAllCategories() {
        Response response = given()
                .when()
                .get("/categories");
        response.prettyPrint();
        response.then().statusCode(200);



    }
}
