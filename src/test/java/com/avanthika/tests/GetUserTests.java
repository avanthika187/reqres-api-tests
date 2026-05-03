package com.avanthika.tests;


import org.testng.annotations.Test;

import com.avanthika.base.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetUserTests extends BaseTest {
	
	@Test
	public void verifyListUsersReturns200() {
		given().spec(requestSpecification)
		.when().get("/users?page=2")
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.body("data", not(empty()))
			.time(lessThan(2000L));
	}
	
	@Test
	public void verifySingleUserData() {
	      given().spec(requestSpecification)
	      .when().get("/users/2")
	      .then()
	          .statusCode(200)
	          .body("data.id", equalTo(2))
	          .body("data.email", notNullValue());
	  }
	
	@Test
	public void verifyUserNotFoundReturns404() {
	      given().spec(requestSpecification)
	      .when().get("/users/999")
	      .then().statusCode(404);
	  }
}
