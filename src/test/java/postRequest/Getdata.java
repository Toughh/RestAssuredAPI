package postRequest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import requestBody.Requestbody;

public class Getdata {
	Requestbody reqbody = new Requestbody();
	static String filePath = new File("").getAbsolutePath();
	static Properties prop = new Properties();
	
	@BeforeClass
	public static void ReadProp() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath + "/src/main/java/utilities/config.properties"));
		prop.load(reader);	
		RestAssured.baseURI = prop.getProperty("baseURI");
	}
	
	@Test
	public void GeneratePNR() throws IOException {
		RequestSpecification request = RestAssured.given()
				.body(reqbody.bodyToSend())
				.headers("Authorization", "czcxNzMxNg==", "Content-Type", "application/json");
			 
		Response response = request.post("/tdm/booking/creationNew");
		JSONObject JSONResponseBody = new JSONObject(response.body().asString());
		System.out.println(JSONResponseBody);
		Assert.assertEquals(200, response.getStatusCode());		
	}
}
