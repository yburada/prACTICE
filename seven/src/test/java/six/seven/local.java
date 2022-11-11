package six.seven;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class local {
	@Test
	void meta() {
        RestAssured.baseURI = "https://reqres.in/";
    	
    	RequestSpecification httprequest = RestAssured.given();
    	
    	Response response = httprequest.request(Method.GET,"api/users/2");
    	
    	String actualValue = response.getBody().asPrettyString();
    	System.out.println(actualValue.toString());
	}

}
