package com.utility;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.testBase.BaseTest;

public class UtilityClass extends BaseTest{
	
	//url get 
		public String getUrl()
		{
			String current_url = driver.getCurrentUrl();
			return current_url;
		}
		
		
		//static String  path = "E:\\new eclipse workspace23\\B_FrameWork_Maven0027\\ScreenShots\\";
		
		static String  path =	"E:\\new eclipse workspace23\\B_FrameWork_Maven0027\\Reports\\";
		public static String failScreenshot(String fileName) throws IOException  {
			Date d=new Date();
			 System.out.println(d.toString());

		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss"); 
			
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path+fileName+" -"+sdf.format(d)+".png");
		FileHandler.copy(src,des);
		
		return path;
	}
	    
		
}
