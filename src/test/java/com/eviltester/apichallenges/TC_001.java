package com.eviltester.apichallenges;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TC_001 {
	
	
	
//requesting entities just	
	@Test
	void getSingleEntity() {
		given()
			.baseUri("https://apichallenges.eviltester.com/")
            .basePath("/sim")
            .log().all().

		when()
			.get("/entities").
		
		then()
			.statusCode(200)
			.header("Content-Type" ,"application/json")
			.log().all();
	}
	

}
