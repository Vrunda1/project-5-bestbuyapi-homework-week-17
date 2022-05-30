package localhost.swagger.stores;

import io.restassured.response.Response;
import localhost.swagger.model.StoresPojo;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StoresPatch extends TestBaseStores {
    @Test
    public void updateUser() {
        HashMap<Object,Object> services = new HashMap<>();
        services.put("01","test");
        services.put("02","automation");

      StoresPojo storesPojo = new StoresPojo();
      storesPojo.setName("primeTestingNew");
      storesPojo.setType("BigBox");
        storesPojo.setAddress("15 Nature Street");
        storesPojo.setAddress2("Harrow Road");
        storesPojo.setCity("London");
        storesPojo.setState("surrey");
        storesPojo.setZip("66205");
        storesPojo.setLat(44.854747);
        storesPojo.setLng(-91.773548);
        storesPojo.setHours("Mon: 10-10; Tue: 10-70; Wed: 10-9; Thurs: 10-8; Fri: 10-8; Sat: 10-9; Sun: 10-6");
        storesPojo.setServices(services);
       Response response = given()
                .header("Content-Type", "application/json")
               .pathParam("id","8922")
                .body(storesPojo)
                .when()
                .patch("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
