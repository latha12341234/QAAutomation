package com.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility{

	public static WebElement getUsername() {

		return driver.findElement(By.id("username"));
	}

	public static WebElement getPassword() {
		return driver.findElement(By.id("password"));

	}

	public static WebElement login() {
		return driver.findElement(By.id("login"));
	}


}
