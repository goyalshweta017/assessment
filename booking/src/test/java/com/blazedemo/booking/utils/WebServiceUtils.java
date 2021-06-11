package com.blazedemo.booking.utils;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class WebServiceUtils {
	
	
	
	public int getStatus() {
	    RestAssured.given();
	    RestAssured.baseURI = "https://api.spacexdata.com/v4/launches/latest";
	    RequestSpecification httpRequest = RestAssured.given();
	    int statusCode = httpRequest.get().getStatusCode();
	    return statusCode;
	  }
	
}
