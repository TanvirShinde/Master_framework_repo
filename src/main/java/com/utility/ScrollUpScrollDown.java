package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.testBase.BaseTest;

public class ScrollUpScrollDown extends BaseTest {

	
	public static void scroll () {
		
		   JavascriptExecutor jk = ( JavascriptExecutor ) driver;
		   
		    jk.executeScript("scrollBy (0 ,200)");
	}
	
	public static void scrollupEle (WebElement ele) {
		
		   JavascriptExecutor jk = ( JavascriptExecutor ) driver;
		   
		   jk.executeScript("arguments[0].scrollIntoView(true);", ele); 
	}
}
