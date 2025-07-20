package com.app.test;

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.app.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReadDaily {

	public static WebDriver driver = null;

	public static void excelRead() {
		try {
			File f = new File(
					"C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\src\\test\\resources\\TestData\\Test.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Sheet1");
			Row row = sh.getRow(0);
			Cell cell = row.getCell(0);
			System.out.println(cell);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void excelAllRead() {
		try {
			File f = new File(
					"C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\src\\test\\resources\\TestData\\Test.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Sheet1");
			int physicalnumberofrow = sh.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalnumberofrow; i++) {
				Row row = sh.getRow(i);
				System.out.println(row);
				int physicalNoofCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNoofCells; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void excelUpdateAllRead() {
		// TODO Auto-generated method stub
		
		try {
			File f = new File(
					"C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\src\\test\\resources\\TestData\\Test.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Sheet1");
			int physicalnumberofrow = sh.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalnumberofrow; i++) {
				Row row = sh.getRow(i);
				System.out.println(row);
				int physicalNoofCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNoofCells; j++) {
					Cell cell = row.getCell(j);
					int cellType=cell.getCellType();
					if(cellType==1) {
						String value=cell.getStringCellValue();
						System.out.println(value);
					}else if(cellType==0) {
						if(DateUtil.isCellDateFormatted(cell)) {
							Date date=cell.getDateCellValue();
							SimpleDateFormat sm=new SimpleDateFormat();
							String dateformatted=sm.format(date);
							System.out.println(dateformatted);
						}
					}

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void excelReuse(int i, int j) {
		// TODO Auto-generated method stub
		try {
			File f = new File(
					"C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\src\\test\\resources\\TestData\\Test.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Sheet1");
			Row row=sh.getRow(i);
			Cell cell=row.getCell(j);
			int cellType=cell.getCellType();
			if(cellType==1) {
				String stringvaluecell=cell.getStringCellValue();
				System.out.println(stringvaluecell);
			}else if (cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date date=cell.getDateCellValue();
					SimpleDateFormat sm= new SimpleDateFormat();
					String datevalue=sm.format(date);
					System.out.println(datevalue);
				}
				else {
					double d=cell.getNumericCellValue();
					long l=(long)d;
					String numericcellvalue=String.valueOf(l);
					System.out.println(numericcellvalue);
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		// new ExcelReadDaily().excelRead();
		// new ExcelReadDaily().excelAllRead();
		//new ExcelReadDaily().excelUpdateAllRead();
		new ExcelReadDaily().excelReuse(0,0);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	

}
