package com.app.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop_Read {
	public static void prop_read() throws IOException {
		File f=new File("C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\"
				+ "src\\test\\resources\\TestData\\configuration.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			Properties prop= new Properties();
			prop.load(fis);
			String url=prop.getProperty("url");
			System.out.println(url);
			String username=prop.getProperty("username");
			System.out.println(username);
			String password=prop.getProperty("password");
			System.out.println(password);


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void prop_read(String data) throws IOException {
		String value=null;
		File f= new File("C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\"+
				"src\\test\\resources\\TestData\\configuration.properties");
		FileReader reader=new FileReader(f);
		Properties prop= new Properties();
		prop.load(reader);
		value=prop.getProperty(data);
		System.out.println(value);


	}
	public static void main(String[] args) throws IOException {
//		new Prop_Read().prop_read("url");
//		new Prop_Read().prop_read("username");
		Prop_Read obj=new Prop_Read();
		obj.prop_read("url");
		obj.prop_read("username");
		obj.prop_read("password");
	}

}
