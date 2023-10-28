package API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicAPITesting {
	
	@Test
	public void GetUsage() {
		baseURI = "https://reqres.in/";
		
		given()
			.get("/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data[1].id", equalTo(8));
		
	}

}
