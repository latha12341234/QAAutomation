package com.app.execution;
import com.app.baseclass.BaseClass;
import com.app.locators.LoginPageLocators;

public class LoginPageExec extends LoginPageLocators {

	
	
		public static void username() {
			BaseClass.inputText(new LoginPageLocators().getUsername(), "Aswinipriyakg");
		}
		
		public static void password() {
			BaseClass.inputText(new LoginPageLocators().getPassword(), "Aswini@040101");
		}
		
		public static void login() {
			BaseClass.click(new LoginPageLocators().getLogin());
		}

}
