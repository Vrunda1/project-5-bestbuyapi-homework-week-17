package localhost.swagger.stores;

import io.restassured.response.Response;
import jdk.nashorn.internal.objects.annotations.Where;
import localhost.swagger.testbase.TestBaseStores;
import org.junit.Test;
import sun.plugin2.os.windows.Windows;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StoresGet extends TestBaseStores {
    @Test
    public void getAllStores() {
        Response response = given()
                .when()
                .get("/stores");
       // response.prettyPrint();
        response.then().statusCode(200);

        int limits = response.then().extract().path("limit");
        System.out.println("1.Message value is : " + limits);

        int totalVal = response.then().extract().path("total");
        System.out.println("2.Message value is : " + totalVal);

        String name = response.then().extract().path("data[4].name");
        System.out.println("3.name of the  5th store : " + name);

        List<String> listofStores =  response.then().extract().path("data.name");
        System.out.println("4.name of the  all store : " + listofStores);

        List<?> listofStoresId =  response.then().extract().path("data.id");
        System.out.println("5.Id of the  all store : " + listofStoresId);

        List<Integer> sizeofData =  response.then().extract().path("data");
        System.out.println("6. Size of data : " +sizeofData.size());

        List<?> storeValue= response.then().extract().path("data.findAll{it.name=='St Cloud'}");
       System.out.println("7.Value of St.Cloud store is : " +storeValue);

        List<HashMap<String, String>> storeAddress= response.then().extract().path("data.findAll{it.name=='Rochester'}.address");
        System.out.println("8.Address of Rochester store is : " +storeAddress);

        List<HashMap<?,?>>storeServices = response.then().extract().path("data[7].services");
        System.out.println("9.Services of the  8th store : " + storeServices);
       // Get storeservices of the store where service name = Windows Store
        List<?> storeservices1 = response.then().extract().path("data.find{it.services}.services.findAll{it.name=='Windows Store'}.storeservices");
        System.out.println("10 Services value is : " +storeservices1);

        List<?> storesId =  response.then().extract().path("data.services.storeservices.storeId");
        System.out.println("11.Id of the  all storeId : " + storesId);

//      12. Get id of all the store
        List<?> allId =  response.then().extract().path("data.id");
        System.out.println("12.Id of the  all store : " + allId);

//        13. Find the store names Where state = ND
        List<Object> storeState= response.then().extract().path("data.findAll{it.state=='ND'}.name");
        System.out.println("13.Stores of ND state : " +storeState);

//        14. Find the Total number of services for the store where store name = Rochester
        List<Object> totalServices= response.then().extract().path("data.findAll{it.name=='Rochester'}.services");
        System.out.println("14.Total services of Rochester store is : " +totalServices);

//        15. Find the createdAt for all services whose name = “Windows Store”
        List<Object> createdAtServices= response.then().extract().path("data.find{it.services}.services.findAll{it.name=='Windows Store'}.storeservices.createdAt");
        System.out.println("15 Created services value is : " +createdAtServices);

        //16. Find the name of all services Where store name = “Fargo”
        List<Object> serviceNameofStore= response.then().extract().path("data.findAll{it.name=='Fargo'}.services");
        System.out.println("16.Service of Fargo is : " +serviceNameofStore);

        List<Integer> listofZip =  response.then().extract().path("data.zip");
        System.out.println("17.Zip of the  all store : " + listofZip);

        List<Object> zipOfStore= response.then().extract().path("data.findAll{it.name=='Roseville'}.zip");
        System.out.println("18.Zip of store Roseville is : " +zipOfStore);

//        19. Find the storeservices details of the service name = Magnolia Home Theater
        List<Object> serviceofMongolia= response.then().extract().path("data.findAll{it.name=='Magnolia Home Theater'}.storeservices");
        System.out.println("19.Service of Magnolia Home Theater is : " +serviceNameofStore);

//        20. Find the lat of all the store
        List<?> lat= response.then().extract().path("data.lat");
        System.out.println("20.All lat : " +lat);

    }
}
