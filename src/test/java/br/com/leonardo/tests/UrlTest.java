package br.com.leonardo.tests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class UrlTest extends BaseTestApi {

	@Test
	public void obterUrl() {
		given().
		when().
			get("/get").
		then().
			statusCode(200).
			body("url", Matchers.is("https://httpbin.org/get"));

	}

}
