package com.blazedemo.booking.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.blazedemo.booking.common.SeleniumTestCommon;

public class ReservePage extends SeleniumTestCommon{
	public ReservePage(WebDriver driver) {
	    super(driver);
	    waitUntilVisible(flighRows.get(0));
	}
	
	List<WebElement> flighRows = driver.findElements(By.cssSelector(".table tbody tr"));
	
	By findFlight = By.cssSelector("[type='submit']");
	
	/**
	 * get the Flights Rows to select
	 * @param index
	 * @return
	 */
	private WebElement getFlightRowElement(int index){
		return flighRows.get(index);
	}
	
	/**
	 * click on flight selection button as per index
	 * @param index
	 */
	public void clickSelectFlightButton(int index){
		WebElement row = getFlightRowElement(index);
		WebElement button = row.findElement(findFlight);
		clickElement(button);
	}
	
	/**
	 * get Prie as per selected flight
	 * @param index
	 * @return
	 */
	public String getPrice(int index){
		WebElement row = getFlightRowElement(index);
		List<WebElement> column = row.findElements(By.cssSelector("td"));
		int size = column.size();
		return column.get(size-1).getText();		
	}
	
	/**
	 * get flight no as per selection
	 * @param index
	 * @return
	 */
	public String getFlightNo(int index){
		WebElement row = getFlightRowElement(index);
		List<WebElement> column = row.findElements(By.cssSelector("td"));
		return column.get(1).getText();
	}
	
	
	
	

	

}
