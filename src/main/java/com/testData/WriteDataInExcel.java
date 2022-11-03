package com.testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		
		 String path = "C:\\Users\\HP\\Desktop\\TanvirShinde.xlsx";
		
  //File source = new File (System.getProperty("user.dir") + "//RenukaMadane.xlsx");
		
	FileInputStream excelbook = new FileInputStream(path);
	
	XSSFWorkbook workbook = new XSSFWorkbook( excelbook );
	
	XSSFSheet sh1 = workbook.getSheetAt(0);
	
	//File source1 = new File (System.getProperty("user.dir") + "//RenukaMadane.xlsx");
	
	 String path1 = "C:\\Users\\HP\\Desktop\\AmbikaMore.xlsx";
		
	
	FileOutputStream excelbook1 = new FileOutputStream(path1);
	
	
	// for row which are exist in excel sheet
     sh1.getRow(5).getCell(0).setCellValue("Tanvir");
	
	 sh1.getRow(5).getCell(1).setCellValue("Shinde");
	
	 workbook.write( excelbook1);
	
//	// if row is not existing or for creating the row
//	sh1.createRow(14).getCell(0).setCellValue("Renuka");
//	
//	sh1.createRow(14).getCell(1).setCellValue("RenukaM");
//	
     
//        
        
        
	
	}
}


