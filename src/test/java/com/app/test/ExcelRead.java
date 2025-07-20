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

public class ExcelRead {
	public  static String excelReuse(int i, int j) {
		// TODO Auto-generated method stub
		String value=null;

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
		return value;}

}
