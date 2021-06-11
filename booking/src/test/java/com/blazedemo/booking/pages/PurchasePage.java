package com.blazedemo.booking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.blazedemo.booking.common.SeleniumTestCommon;

public class PurchasePage extends SeleniumTestCommon{
	public PurchasePage(WebDriver driver) {
	    super(driver);
	    waitUntilVisible(name);
	}
	
	@FindBy(css = "#inputName")
	 WebElement name;
	
	@FindBy(css = "#address")
	 WebElement address;
	
	@FindBy(css = "#cardType")
	 WebElement cardType;
	
	@FindBy(css = "#creditCardNumber")
	WebElement cardNumber;
	
	@FindBy(css = "[type='submit']")
	WebElement submitButton;
	
	/**
	 * Enter name in Page
	 * @param pName
	 */
	public void enterName(String pName){
		setTextEntryValue(name, pName);
	}
	
	/**
	 * Enter address
	 * @param add
	 */
	public void enterAddress(String add) {
		setTextEntryValue(address, add);
	}
	
	/**
	 * enter Credit card
	 * @param card
	 */
	public void enterCardNo(String card) {
		setTextEntryValue(cardNumber, card);
	}
	
	/**
	 * select card type
	 * @param card
	 */
	public void selectCardType(String card) {		
		selectElementFromDropdown(cardNumber, card);
	}
	
	/**
	 * clickPurchase link
	 */
	public void clickPurchaseFlight(){
		clickElement(submitButton);
	}

}
