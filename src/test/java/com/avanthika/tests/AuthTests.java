package com.avanthika.tests;



import org.testng.annotations.Test;

import com.avanthika.base.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AuthTests extends BaseTest {
	@Test
	public void loginWithValidCredentials() {
	    String body = "{\"email\":\"eve.holt@reqres.in\",\"password\":\"cityslicka\"}";
	    given().spec(requestSpecification).body(body)
	    .when().post("/login")
	    .then()
	        .statusCode(200)
	        .body("token", notNullValue());
	}

	@Test
	public void loginWithMissingPasswordReturns400() {
	    String body = "{\"email\":\"eve.holt@reqres.in\"}";
	    given().spec(requestSpecification).body(body)
	    .when().post("/login")
	    .then()
	        .statusCode(400)
	        .body("error", equalTo("Missing password"));
	}

}
