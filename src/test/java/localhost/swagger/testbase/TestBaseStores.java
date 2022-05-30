package localhost.swagger.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBaseStores {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
      RestAssured.port = 3030;



    }
}
