package com.utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	
	public static String readData (int row , int column) throws IOException  {
	
		File source = new File (System.getProperty("user.dir") + "//DalalStrret.xlsx");
		
		FileInputStream excelfile = new FileInputStream(source);
		

		XSSFWorkbook workbook = new XSSFWorkbook(excelfile);
		

		XSSFSheet sh1 = workbook.getSheetAt(0);
		
		String value = sh1.getRow(row).getCell(column).getStringCellValue();
		

		return value;
		
		
		  
		
		
		
	}
	
}
