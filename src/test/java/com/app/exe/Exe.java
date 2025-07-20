package com.app.exe;

import com.app.execution.LoginPageExec;
import com.app.execution.SearchHotelExec;

import java.io.IOException;

import org.junit.Test;

import com.app.execution.BookHotelExec;
import com.app.execution.ConfirmationExec;

public class Exe extends ConfirmationExec {

	@Test

	public void test() {
		try {
			// launchBrowser();
			username();
			password();
			login();

			getLocation();
			getHotels();
			getRoomType();
			getNumberofRooms();
			getCheckinDate();
			getCheckoutDate();
			getAdultperroom();
			getChildperroom();
			search();

			getrradiobutton();
			getcontinuebutton();
			getfirstname();
			getlastname();
			getaddress();
			get_cc_num();
			get_cc_type();
			get_cc_expmonth();
			get_cc_expyear();
			get_CVV();
			get_bookbutton();

			Thread.sleep(5000);
			getorderNo();

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			excelwrite();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
