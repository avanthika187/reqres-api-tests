package com.avanthika.tests;


import org.testng.annotations.Test;

import com.avanthika.base.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserTests extends BaseTest {
	
	@Test
	public void createUserReturns201() {
	    String body = "{ \"name\": \"Bella\", \"job\": \"Engineer\" }";
	    given().spec(requestSpecification).body(body)
	    .when().post("/users")
	    .then()
	        .statusCode(201)
	        .body("name", equalTo("Bella"))
	        .body("id", notNullValue());
	}

}
