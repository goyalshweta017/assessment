package com.blazedemo.booking.common;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestCommon extends TestPage{
	
	WebDriverWait webDriverWait = new WebDriverWait(driver, 6000);
	
	public SeleniumTestCommon(WebDriver driver) {		
		
	}
	
	protected void clickElement(WebElement element) {
	    waitUntilClickable(element);
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element);
	    actions.click(element);
	    actions.perform();
	}		
	
	protected void waitUntilClickable(WebElement webElement) {		
		webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	protected void waitUntilVisible(WebElement webElement) {
		webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
	}
	
	protected void selectElementFromDropdown(final WebElement element, String optionValue) {
		waitUntilVisible(element);
		Select objSelect = new Select(element);
		objSelect.selectByValue(optionValue);
		
	}
	
	protected void setTextEntryValue(WebElement element, String text) {
	    waitUntilVisible(element);
	    // focus
	    element.click();
	    // clear existing value
	    element.clear();
	    // set given value
	    element.sendKeys(text);
	    // blur
	    element.sendKeys(Keys.TAB);
	  }
	
}
