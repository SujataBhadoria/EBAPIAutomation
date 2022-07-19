package BDDRestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredGet {
	
@Test
public void getAPITest()
{
	RestAssured.baseURI = "http://ergast.com";
	
	given()
	.when()
	.get("/api/f1/2017/circuits.json")
	.then()
		.assertThat()
		.statusCode(404)
		.and()
		.contentType(ContentType.JSON)
		.header("Content-Length", equalTo("4552"));
}
	

}
