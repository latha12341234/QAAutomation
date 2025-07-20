package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationpageLocators extends BookHotelLocators {

	@FindBy(xpath="//input[@id='order_no']")
	private  WebElement orderno;

	public WebElement getOrderNo() {
		// TODO Auto-generated method stub
		return orderno;
	}

}
