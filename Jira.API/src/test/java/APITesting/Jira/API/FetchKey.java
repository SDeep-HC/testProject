package APITesting.Jira.API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Reusables;

public class FetchKey {
	//Properties props =new Properties();
	
@BeforeTest
public void getData() throws IOException {
	FileInputStream F= new FileInputStream("C:\\Users\\Souradeep\\eclipse-workspace\\Jira.API\\src\\main\\java\\Base\\URLs.Properties");
	//props.load(F);
	
}
@Test
public void getKey() {
	
	System.out.println("pass");
          }

}
