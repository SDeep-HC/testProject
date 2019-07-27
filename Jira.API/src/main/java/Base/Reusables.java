package Base;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Reusables {
	public static Logger log = LogManager.getLogger(Reusables.class.getName());
	//Properties props =new Properties();
	public JsonPath rawToJson(Response R ) {
		
		String s = R.asString();
		JsonPath js = new JsonPath(s);
		return js;
	}
	public String getKey() {
		RestAssured.baseURI = "http://localhost:8080";
		Response resp =given().
		               header("Content-Type","application/json").
		               body("{ \"username\": \"Deep\", \"password\": \"Deep@1234\" }").
		               log().all().
		               when().
		               post("/rest/auth/1/session").
		               then().assertThat().statusCode(200).and().contentType("application/json").log().all().
		               extract().response();
		Reusables rs = new Reusables();
		JsonPath js= rs.rawToJson(resp);
		String s=js.get("session.value");
		return s;

		
	          }


}
