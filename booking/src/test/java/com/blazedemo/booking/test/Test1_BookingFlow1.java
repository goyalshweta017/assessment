package com.blazedemo.booking.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.blazedemo.booking.common.TestPage;
import com.blazedemo.booking.pages.ConfirmationPage;
import com.blazedemo.booking.pages.HomePage;
import com.blazedemo.booking.pages.PurchasePage;
import com.blazedemo.booking.pages.ReservePage;

public class Test1_BookingFlow1 extends TestPage {
	
	public Test1_BookingFlow1() {
		
	}
	
	
	@Test
    public void execute() throws InterruptedException {


	    // Launch URL
	    driver.get(url);
	    driver.manage().window().maximize();

	    // On First Page select Flight
	    HomePage home = PageFactory.initElements(driver, HomePage.class);
	    home.selectDeparture("Paris");
	    home.selectArrival("London");
	    home.findFlight();
	   
	    // On Reservation Page make selection
	    ReservePage reserve = PageFactory.initElements(driver, ReservePage.class);
	    int flightRow = 0;
//	    String flightNo = reserve.getFlightNo(flightRow);
//	    String price = reserve.getPrice(flightRow);
	    reserve.clickSelectFlightButton(flightRow);
	    
	    // on Purchase page complete booking
	    PurchasePage purchase = PageFactory.initElements(driver, PurchasePage.class);
	    purchase.enterName("test");
	    purchase.enterAddress("address");
	    purchase.selectCardType("Visa");
	    purchase.enterCardNo("12345678");
	    purchase.clickPurchaseFlight();
	    /**
	     * Code to verify the price and flight
	     */
	    
	    // Verify Booking is confirmed
	    ConfirmationPage conf = PageFactory.initElements(driver, ConfirmationPage.class);
	    conf.verifyHeader("Thank you for your purchase today!");
	  }

}
