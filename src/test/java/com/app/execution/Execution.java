package com.app.execution;
import java.io.IOException;

import com.app.baseclass.BaseClass;
import com.app.locators.Locators;

public class Execution extends Locators {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		//BaseClass.getURL(ExcelRead.excelReuse(0, 0));

		//Calling code via below using excel read
		//BaseClass.launchBrowser();
		//BaseClass.gettheurl(BaseClass.excelresue(0, 1));
		//BaseClass.inputText(Locators.getUsername(), BaseClass.excelresue(1, 1));
		//BaseClass.inputText(Locators.getPassword(),BaseClass.excelresue(2, 1));
		
		// Calling via below code by using properties file
		BaseClass.launchBrowser();
		BaseClass.gettheurl(BaseClass.prop_read("url"));
		BaseClass.inputText(Locators.getUsername(), BaseClass.prop_read("username"));
		BaseClass.inputText(Locators.getPassword(), BaseClass.prop_read("password"));
		
		BaseClass.click(Locators.login());
		BaseClass.dropDown(Locators.getLocation(),BaseClass.excelresue(3, 1));
		BaseClass.dropDown(Locators.getHotels(), BaseClass.excelresue(4, 1));
		BaseClass.dropDown(Locators.getRoomType(),BaseClass.excelresue(5, 1));
		BaseClass.dropDown(Locators.getNumberofRooms(), BaseClass.excelresue(6, 1));
		BaseClass.inputDate(Locators.getCheckinDate(),BaseClass.excelresue(7, 1));
		BaseClass.inputDate(Locators.getCheckoutDate(), BaseClass.excelresue(8, 1));
		BaseClass.dropDown(Locators.getAdultperroom(), BaseClass.excelresue(9, 1));
		BaseClass.dropDown(Locators.getChildperroom(), BaseClass.excelresue(10, 1));
		BaseClass.click(Locators.searchbutton());
		Thread.sleep(2000);
		BaseClass.click(Locators.getSelect());
		
		BaseClass.click(Locators.continuebutton());	
		BaseClass.inputText(Locators.getFirstname(), BaseClass.excelresue(11, 1));
		BaseClass.inputText(Locators.getLastname(), BaseClass.excelresue(12, 1));
		BaseClass.inputText(Locators.getAddress(), BaseClass.excelresue(13, 1));
		BaseClass.inputText(Locators.getCreditcardNo(), BaseClass.excelresue(14, 1));
		BaseClass.dropDown(Locators.getCreditcardType(), BaseClass.excelresue(15, 1));
		BaseClass.dropDown(Locators.getMonth(),BaseClass.excelresue(16, 1));
		BaseClass.dropDown(Locators.getYear(),BaseClass.excelresue(17, 1));
		BaseClass.inputText(Locators.getCVV(), BaseClass.excelresue(18,1));
		BaseClass.click(Locators.getBookButtton());
		Thread.sleep(5000);
		
		BaseClass.getOrderno(Locators.getOrderNo());
		Thread.sleep(5000);
		BaseClass.excel_Write("NewSheet",BaseClass.orderNo);
		
	}

}
