package Com.RestAssured.Project.com.test.restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
//import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Place_Get_Class {
	@Test
    public void getMethod(){
    	
    	RestAssured.baseURI = "https://maps.googleapis.com";
   
    given().
        param("query","123+main+street").
        param("key", "AIzaSyDupuEf9WA2UhooaWf3uWareXryJ2rfn9g").
    when().
        get("https://maps.googleapis.com/maps/api/place/textsearch/json").
    then().
        assertThat().statusCode(200);
        
    }

}
