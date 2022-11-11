package two;



import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class three { 
	
	@BeforeTest
	void four() {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httprequest = RestAssured.given();
		Response rs = httprequest.request(Method.GET,"api/users/2");
		String s = rs.getBody().asPrettyString();
		System.out.println(s);
	}

}
