package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Forgotton_Password;
import com.testBase.BaseTest;
import com.utility.UtilityClass;

public class Forgotton_Password_Test extends BaseTest{
	
	String expected_url = "https://www.apps.dalalstreet.ai/forgot-password";

	@Test
	public void forgotPassword () throws InterruptedException {
		
		Forgotton_Password fp = new Forgotton_Password () ;
		
		fp.forgetPassword();
		
		Thread.sleep(3000);
		
		 UtilityClass uc = new UtilityClass();
		 
		   String actual_url = uc.getUrl();
		   
		 Assert.assertEquals(actual_url, expected_url);
		 
		   
		
	}
}
