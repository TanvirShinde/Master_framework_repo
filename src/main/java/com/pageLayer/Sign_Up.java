package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class Sign_Up extends BaseTest{

	
	@FindBy(xpath = "//*[@class='fw-medium text-primary']")
	private WebElement sign_up_Now_link;
	
     public Sign_Up () {
		
		PageFactory.initElements(driver, this);
	}
	
     
     public void signUpDalalStreet () {
    	 
    	 sign_up_Now_link.click();
    	 
     }
}






//       