package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageLayer.LoginPage;
import com.testBase.BaseTest;
import com.utility.UtilityClass;

public class LoginPageTest extends BaseTest{
	
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";

	@Test (priority =1)
	public void logintest () throws IOException, InterruptedException {
		
	  lp = new LoginPage();
	  
	 
	 
	 lp.verifyLogin();
	 
	 Thread.sleep(2000);
	 
	 UtilityClass uc = new UtilityClass();
	 
	   String actual_url = uc.getUrl();
	   
	   logger.info("Verify actual url ");
	 
	   Assert.assertEquals(actual_url , expected_url);
	   
	 
	}
	
	
}
         