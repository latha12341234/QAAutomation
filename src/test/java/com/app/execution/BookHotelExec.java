package com.app.execution;

import com.app.baseclass.BaseClass;
import com.app.locators.BookHotelLocators;
import com.app.locators.SearchHotelLocators;

public class BookHotelExec extends SearchHotelExec {

	public static void getrradiobutton() {
		BaseClass.click(new BookHotelLocators().getradiobutton());}
	
	public static void getcontinuebutton() {
		BaseClass.click(new BookHotelLocators().continuebutton());}
	
	public static void getfirstname() {
		BaseClass.inputText(new BookHotelLocators().getFirstname(), BaseClass.excelresue(11, 1));}
	
	public static void getlastname() {
		BaseClass.inputText(new BookHotelLocators().getLastname(), BaseClass.excelresue(12, 1));}
	
	public static void getaddress() {
		BaseClass.inputText(new BookHotelLocators().getAddress(), BaseClass.excelresue(13, 1));}
	
	public static void get_cc_num() {
		BaseClass.inputText(new BookHotelLocators().getCreditcardNo(), BaseClass.excelresue(14, 1));}
	
	public static void get_cc_type() {
		BaseClass.dropDown(new BookHotelLocators().getCreditcardType(), BaseClass.excelresue(15, 1));}
	
	public static void get_cc_expmonth() {
		BaseClass.dropDown(new BookHotelLocators().getMonth(), BaseClass.excelresue(16, 1));}
	
	
	public static void get_cc_expyear() {
		BaseClass.dropDown(new BookHotelLocators().getYear(),BaseClass.excelresue(17, 1));}
	
	
	public static void get_CVV() {
		BaseClass.inputText(new BookHotelLocators().getCVV(),BaseClass.excelresue(18, 1));}
	
	public static void get_bookbutton() {
		BaseClass.click(new BookHotelLocators().getBookButtton());}
	
}
