package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {


public static String capturescreenshot (WebDriver driver , String filename) throws IOException  {
		
		String destpath = System.getProperty("user.dir")+"\\Reports\\"+ filename + ".png";
		
		TakesScreenshot snapshot = ( TakesScreenshot ) driver ;
		 
		 File source = snapshot.getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File (destpath) ;
		 
		 FileHandler.copy(source, destination);
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss"); 
		    
			Date d=new Date();
			
			File des=new File(destpath+filename+" -"+sdf.format(d)+".png");
			
			 return destpath;
		}
		 
		
		 	 
	}

   
