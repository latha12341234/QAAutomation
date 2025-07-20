package com.app.execution;

import com.app.baseclass.BaseClass;
import com.app.locators.Locators;
import com.app.locators.SearchHotelLocators;

public class SearchHotelExec extends LoginPageExec {
	
	public static void getLocation() {
	BaseClass.dropDown(new SearchHotelLocators().getLocation(),BaseClass.excelresue(3, 1));}
	
	public static void getHotels() {
	BaseClass.dropDown(new SearchHotelLocators().getHotels(), BaseClass.excelresue(4, 1));}
	
	public static void getRoomType() {
	BaseClass.dropDown(new SearchHotelLocators().getRoomType(),BaseClass.excelresue(5, 1));
	}
	public static void getNumberofRooms() {
	BaseClass.dropDown(new SearchHotelLocators().getNumberofRooms(), BaseClass.excelresue(6, 1));}
	
	public static void getCheckinDate() {
	BaseClass.inputDate(new SearchHotelLocators().getCheckinDate(),BaseClass.excelresue(7, 1));}
	
	public static void getCheckoutDate() {
	BaseClass.inputDate(new SearchHotelLocators().getCheckoutDate(), BaseClass.excelresue(8, 1));}
	
	public static void getAdultperroom() {
	BaseClass.dropDown(new SearchHotelLocators().getAdultperroom(), BaseClass.excelresue(9, 1));}
	
	public static void getChildperroom() {
	BaseClass.dropDown(new SearchHotelLocators().getChildperroom(), BaseClass.excelresue(10, 1));}
	
	public static void search() {
	BaseClass.click(new SearchHotelLocators().searchbutton());}
}
