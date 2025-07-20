package com.app.execution;

import java.io.IOException;

import com.app.baseclass.BaseClass;
import com.app.locators.ConfirmationpageLocators;
import com.app.locators.Locators;

public class ConfirmationExec extends BookHotelExec {

	public static void getorderNo() {
		BaseClass.getOrderno(new ConfirmationpageLocators().getOrderNo());
	}
	public static void excelwrite() throws IOException {
	BaseClass.excel_Write("NewSheet",BaseClass.orderNo);}
	
	
	
}
