package br.com.leonardo.tests;

import org.testng.annotations.BeforeTest;

import br.com.leonardo.core.Constantes;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class BaseTestApi implements Constantes {
	
	@BeforeTest
	public static void setup() {
		RestAssured.baseURI = APP_BASE_URL;
		
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.setContentType(APP_CONTENT_TYPE);
		RestAssured.requestSpecification = reqBuilder.build();
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		
	}

}
