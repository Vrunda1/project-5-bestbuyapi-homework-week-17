package localhost.swagger.categories;

import io.restassured.response.Response;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class Categoriesdelete extends TestBaseStores {
    @Test
    public void categoryDelete() {


       Response response = given()
                .header("Content-Type", "application/json")
               .pathParam("id","pcrcat84000050012")
                .when()
                .delete("/categories/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
