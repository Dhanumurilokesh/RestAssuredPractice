package test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;

public class fisrtScript {
	
//get api test method basic
	@Test(enabled = false)
	void getapi(){
		given()
			.baseUri("http://reqres.in/")
			.contentType(ContentType.JSON).
		
		when()
			.get("/api/users").
		
		then().
			statusCode(200).
			log().all();	 
	}
	
	@Test
	void getListUsers() 
	{
		
		given()
			.baseUri("https://reqres.in/").
			
		when().
			get("/api/users").
			
		then().
		    statusCode(200);
		;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
