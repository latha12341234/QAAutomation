package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelLocators extends LoginPageLocators {

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public  WebElement getHotels() {
		// TODO Auto-generated method stub
		return hotels;
	}

	@FindBy(id="room_type")
	private WebElement room_type;

	public  WebElement getRoomType() {
		return room_type;
	}
	
	@FindBy(id="room_nos")
	private WebElement room_nos;

	public  WebElement getNumberofRooms() {
		// TODO Auto-generated method stub
		return room_nos;
	}

	@FindBy(id="datepick_in")
	private WebElement datepick_in;
	
	public WebElement getCheckinDate() {
		// TODO Auto-generated method stub
		return datepick_in;
	}

	@FindBy(id="datepick_out")
	
	private WebElement datepick_out;
	
	public  WebElement getCheckoutDate() {
		// TODO Auto-generated method stub
		return datepick_out;
	}

	@FindBy(id="adult_room")
	
	private WebElement adult_room;
	public WebElement getAdultperroom() {
		// TODO Auto-generated method stub
		return adult_room;
	}

	@FindBy(id="child_room")
	
	private WebElement child_room;
	public  WebElement getChildperroom() {
		// TODO Auto-generated method stub
		return child_room;
	}

	@FindBy(id="Submit")
	private WebElement submit;
	public  WebElement searchbutton() {
		return submit;
	}
}
