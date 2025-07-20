package com.app.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void excel_Write() throws IOException {
		File f = new File("C:\\Users\\Thanmaya\\Eclipsehomework\\TestMaven\\"
				+ "src\\test\\resources\\TestData\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.createSheet("AiiteTestOutput");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Java");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWrite ew= new ExcelWrite();
		ew.excel_Write();
	}

}
