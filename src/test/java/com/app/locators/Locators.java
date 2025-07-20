package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.baseclass.BaseClass;

public class Locators extends BaseClass {

	public static WebElement getUsername() {

		return driver.findElement(By.id("username"));
	}

	public static WebElement getPassword() {
		return driver.findElement(By.id("password"));

	}

	public static WebElement login() {
		return driver.findElement(By.id("login"));
	}

	public static WebElement getLocation() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("location"));
	}

	public static WebElement getHotels() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//select[@id='hotels']"));
	}

	public static WebElement getRoomType() {
		return driver.findElement(By.id("room_type"));
	}

	public static WebElement getNumberofRooms() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("room_nos"));
	}

	public static WebElement getCheckinDate() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("datepick_in"));
	}

	public static WebElement getCheckoutDate() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("datepick_out"));
	}

	public static WebElement getAdultperroom() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("adult_room"));
	}

	public static WebElement getChildperroom() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("child_room"));
	}

	public static WebElement searchbutton() {

		return driver.findElement(By.id("Submit"));
	}

	public static WebElement getSelect() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("radiobutton_0"));
	}

	public static WebElement continuebutton() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//input[@id='continue']"));
	}

	public static WebElement getFirstname() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("first_name"));
	}

	public static WebElement getLastname() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("last_name"));
	}

	public static WebElement getAddress() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("address"));
	}

	public static WebElement getCreditcardNo() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("cc_num"));
	}

	public static WebElement getCreditcardType() {
		return driver.findElement(By.id("cc_type"));
	}

	public static WebElement getMonth() {
		return driver.findElement(By.id("cc_exp_month"));
	}

	public static WebElement getYear() {
		return driver.findElement(By.id("cc_exp_year"));
	}

	public static WebElement getCVV() {
		return driver.findElement(By.id("cc_cvv"));
	}

	public static WebElement getBookButtton() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("book_now"));
	}

	public static WebElement getOrderNo() {
		return driver.findElement(By.xpath("//input[@id='order_no']"));
		// TODO Auto-generated method stub
		//return driver.findElement(By.id("order_no"));
		
	}

}