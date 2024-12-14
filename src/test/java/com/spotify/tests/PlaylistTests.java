package com.spotify.tests;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PlaylistTests {
// package io.restassured.specification;
	
/* Below two are interfaces 
		 *  Rest Assured provides the 
		 *  RequestSpecification and ResponseSpecification interfaces 
		 *  to help create these reusable specifications. 
		 *  These can be used for setting up common details for requests and responses.
 
io.restassured.builder  ---->>Package 
 // RequestSpecBuilder 
		 *  In Rest Assured, the RequestSpecBuilder is a utility class 
		 *  used to build custom RequestSpecification objects. 
		 *    why ?
		 *  Instead of setting up each request configuration 
		 *  individually using given(), you can use the RequestSpecBuilder to create a RequestSpecification, 
		 *  which can then be reused for multiple requests.
		 *  
io.restassured.builder  ---->>Package 
//ResponseSpecBuilder
         * The ResponseSpecBuilder in Rest Assured is a utility class used 
         * to build a custom ResponseSpecification object, similar to how 
         * RequestSpecBuilder works for request specifications. The ResponseSpecBuilder 
         * allows you to configure expected properties of the API response, such as the 
         * status code, response body, headers, and content type.
         *   why ?
         * Once created, the ResponseSpecification can be reused across 
         * different tests to validate responses consistently.

	 * */
	RequestSpecification reqspec;
	ResponseSpecification resspec;
	
	@BeforeClass
	void beforeclass() {
		
		//RequestSpecBuilder [io.restassured.builder]
		RequestSpecBuilder reqbuilder = new RequestSpecBuilder();
		reqbuilder.setBaseUri("https://api.spotify.com/").
		addHeader("Authorization","Barer").
		setContentType(ContentType.JSON).
		log(LogDetail.ALL);
		
		//ResponseSpecBuilder [io.restassured.builder]
		ResponseSpecBuilder resbuilder = new ResponseSpecBuilder();
		resbuilder.expectStatusCode(200).
		expectHeader("Content-Type", "application/json").
		log(LogDetail.ALL);
		
		//RequestSpecification --package io.restassured.specification
		reqspec = reqbuilder.build();
		
		//ResponseSpecification --package io.restassured.specification
		resspec = resbuilder.build();
		// .build [nonstatic]method returns specification objects of respective interfaces.
		
		
	}
	
	
	

}
