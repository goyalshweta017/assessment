package com.blazedemo.booking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;
import com.blazedemo.booking.common.SeleniumTestCommon;


public class ConfirmationPage extends SeleniumTestCommon{
	public ConfirmationPage(WebDriver driver) {
	    super(driver);
	    waitUntilVisible(header);
	}
	
	@FindBy(css = "h1")
	WebElement header;
	
	/**
	 * verify the header confirmation
	 * @param Expectedtext
	 */
	public void verifyHeader(String Expectedtext){
		String actualText = header.getText();
		assertEquals(Expectedtext, actualText);
	}
	
	

}
