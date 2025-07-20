package com.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public static WebDriver driver;
	public String url = null;

@BeforeClass
	public static void launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}


	public static void gettheurl(String url) {
		driver.get(url);
	}

@Test
	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static String excelresue(int i, int j) {
		// TODO Auto-generated method stub
		String value = null;
		try {
			File f = new File("C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\"
					+ "src\\test\\resources\\TestData\\New Microsoft Excel Worksheet.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Sheet1");
			Row row = sh.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date datecellvalue = cell.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value = sm.format(datecellvalue);
					System.out.println(value);
				} else {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
