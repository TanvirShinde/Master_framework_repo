package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Sign_Up;
import com.testBase.BaseTest;
import com.utility.UtilityClass;

public class SignUpTest  extends BaseTest {

	String expected_url = "https://www.apps.dalalstreet.ai/register";
	
	@Test
	public void signUpNow () throws InterruptedException {
		
		Sign_Up su = new Sign_Up () ;
		
	          su.signUpDalalStreet();
	          
	          Thread.sleep(2000);
	      
	      UtilityClass uc = new UtilityClass();
			 
		   String actual_url = uc.getUrl();
		   
		 Assert.assertEquals(actual_url, expected_url);   
	}
}
