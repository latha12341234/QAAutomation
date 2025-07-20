package com.app.baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver ;
	public String url=null;
	public static String orderNo=null;
	public static TakesScreenshot ts;
	public static Alert alert;
	public static Actions action;
	public static Robot rob;
	public static Select sel;
	
	@BeforeClass
	public static void launchBrowser(){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	}
	
	public static void gettheurl(String url) {
		driver.get(url);
	}

	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static String excelresue(int i, int j) {
		// TODO Auto-generated method stub
		String value=null;
		try {
			File f = new File("C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\"
					+"src\\test\\resources\\TestData\\New Microsoft Excel Worksheet.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Sheet1");
			Row row=sh.getRow(i);
			Cell cell=row.getCell(j);
			int cellType=cell.getCellType();
			if(cellType==1) {
				value=cell.getStringCellValue();
				System.out.println(value);
			}else if (cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date datecellvalue=cell.getDateCellValue();
					SimpleDateFormat sm= new SimpleDateFormat("dd/MM/yyyy");
					value=sm.format(datecellvalue);
					System.out.println(value);
				}
				else {
					double d=cell.getNumericCellValue();
					long l=(long)d;
					value=String.valueOf(l);
					System.out.println(value);
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
		}
	public static String excel_Write(String data, String orderNo) throws IOException {
		// TODO Auto-generated method stub
		int i=0,j=0;
		File f= new File("C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\"
			+"src\\test\\resources\\TestData\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet=wb.createSheet(data);
		Row row=sheet.createRow(i);
		Cell cell=row.createCell(j);
		cell.setCellValue(orderNo);
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
		return data;
		
	}
	public static void click(WebElement element) {
		// TODO Auto-generated method stub
		element.click();
	}
	public static void dropDown(WebElement dropDown, String excelresue) {
		// TODO Auto-generated method stub
		Select sel= new Select(dropDown);
		sel.selectByVisibleText(excelresue);}  
	
	public static void inputDate(WebElement checkinDate, String excelresue) {
		// TODO Auto-generated method stub
		checkinDate.clear();
		checkinDate.sendKeys(excelresue);
	}
	public static void getOrderno(WebElement order) {
		// TODO Auto-generated method stub
		orderNo=order.getAttribute("value");
		System.out.println("OrderNo:"+orderNo);
	}
		
	public static String prop_read(String data) throws IOException {
		String value=null;
		File f= new File("C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\"+
				"src\\test\\resources\\TestData\\configuration.properties");
		FileReader reader=new FileReader(f);
		Properties prop= new Properties();
		prop.load(reader);
		value=prop.getProperty(data);
		System.out.println(value);
		
		FileWriter writer= new FileWriter(f);
		prop.store(writer, value);		
		return value;
	}
	public static void TakeScreenshot(String name) throws IOException {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source= ts.getScreenshotAs(OutputType.FILE);
		 File Destination= new File("C:\\user\\"+name);
		 FileHandler.copy(source, Destination);
		 FileUtils.copyFile(source, Destination);
	}
	public static void alertAccept(WebElement element) {
		driver.switchTo().alert();
		alert.accept();
	}
	public static void alertDismiss(WebElement element) {
		driver.switchTo().alert();
		alert.accept();
	}
	
	public static void moveToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element);
		
	}
	public static void robot() throws AWTException {
		new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void select(WebElement element) {
		new Select(element);
		sel.selectByVisibleText("pineapple");
	}

	public static void getWindowHandle() {
		String window=driver.getWindowHandle();
		driver.switchTo().window(window);
	}
	
	public static void getWindowHandles() {
		Set<String> windowhandles=driver.getWindowHandles();
		for(String window :windowhandles) {
			driver.switchTo().window(window);
		}
	}
	
}
	
	
	
	
	
