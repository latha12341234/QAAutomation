package com.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class Execution1 extends LoginPage {
public static void main(String[] args) {
	//Calling code via below using excel read

			Utility.launchBrowser("https://adactinhotelapp.com/");
			Utility.gettheurl(Utility.excelresue(0, 1));
			Utility.inputText(LoginPage.getUsername(), Utility.excelresue(1, 1));
			Utility.inputText(LoginPage.getPassword(),Utility.excelresue(2, 1));
			
}
}
