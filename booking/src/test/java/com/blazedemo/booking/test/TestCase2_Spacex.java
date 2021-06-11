package com.blazedemo.booking.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TestCase2_Spacex {
	
	public TestCase2_Spacex() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
    public void execute() throws InterruptedException {
		
		RestAssured.baseURI = "https://api.spacexdata.com/v4/launches/latest";
	    RequestSpecification httpRequest = RestAssured.given();
	    Response response = httpRequest.relaxedHTTPSValidation().when().get("https://api.spacexdata.com/v4/launches/latest");
		int statusCode = response.getStatusCode();
	    
	      
	    //First Validation - Validate Status Code
	    assertEquals(200, statusCode);
	    

	    String data = response.getBody().prettyPrint();	    
	    //Second Validation - validate ships
	    JsonPath js = new JsonPath(data);
	    List<String> name = js.get("payloads");
	    System.out.println(name.toString());
	    
	    
	}


}
