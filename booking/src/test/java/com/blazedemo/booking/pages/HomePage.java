package com.blazedemo.booking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.blazedemo.booking.common.SeleniumTestCommon;

public class HomePage extends SeleniumTestCommon{
	public HomePage(WebDriver driver) {
	    super(driver);
	    waitUntilVisible(fromPort);	    
	}
	
	@FindBy(css = "[name='fromPort']")
	 WebElement fromPort;
	
	@FindBy(css = "[name='toPort']")
	 WebElement toPort;
	
	@FindBy(css = "[type='submit']")
	WebElement submitButton;
	
	/**
	 * method to select departure
	 * @param depCity
	 */
	public void selectDeparture(String depCity){
		selectElementFromDropdown(fromPort, depCity);
	}
	
	/**
	 * Method to select arrival
	 * @param arrCity
	 */
	public void selectArrival(String arrCity){
		selectElementFromDropdown(toPort, arrCity);
	}
	
	/**
	 * click find flight
	 */
	public void findFlight(){
		clickElement(submitButton);
	}
	
}
