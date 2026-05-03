package com.avanthika.base;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected RequestSpecification requestSpecification;
	
	@BeforeClass
	public void setUp() {
		requestSpecification = new RequestSpecBuilder()
				.setBaseUri("https://reqres.in/api")
				.setContentType(ContentType.JSON)
				.addHeader("x-api-key", "free_user_3DDSPkuQ4nI9ZfScfrTPNzTdoqs")
				.build();
		
	}
}
