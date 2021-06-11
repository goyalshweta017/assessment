package com.blazedemo.booking.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {
	
	protected WebDriver driver;
	protected static String url = "https://blazedemo.com/";
	
	@Before
	public void getChromeDriver() {
	    System.setProperty("webdriver.chrome.driver",
	                       "src\\test\\java\\com\\blazedemo\\booking\\common\\chromedriver.exe");
	    driver = new ChromeDriver();	    
    }
	
	@After
	public void endTest(){
		driver.close();
	}
	


}
