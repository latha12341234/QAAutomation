package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelLocators extends SearchHotelLocators {

	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;

	public  WebElement getradiobutton() {
		return radiobutton;
	}

	@FindBy(id="continue")
	private WebElement continuebutton;
	public WebElement continuebutton() {
		return continuebutton;
	}

	@FindBy(id="first_name")
	private WebElement firstname;
	public  WebElement getFirstname() {
		// TODO Auto-generated method stub
		return firstname;
	}

	@FindBy(id="last_name")
	private WebElement lastname;
	public  WebElement getLastname() {
		// TODO Auto-generated method stub
		return lastname;
	}

	@FindBy(id="address")
	private WebElement address;
	public  WebElement getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@FindBy(id="cc_num")
	private WebElement cc_num;
	public WebElement getCreditcardNo() {
		// TODO Auto-generated method stub
		return cc_num;
	}

	@FindBy(id="cc_type")
	private WebElement cc_type;
	public WebElement getCreditcardType() {
		return cc_type;
	}

	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	public WebElement getMonth() {
		return cc_exp_month;
	}

	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	public WebElement getYear() {
		return cc_exp_year;
	}

	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	public WebElement getCVV() {
		return cc_cvv;
	}

	@FindBy(id="book_now")
	private WebElement book_now;
	public  WebElement getBookButtton() {
		return book_now;
	}
}
