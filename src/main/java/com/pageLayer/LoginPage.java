package com.pageLayer;


import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;
import com.utility.ReadDataExcel;
import com.utility.ScrollUpScrollDown;





public class LoginPage extends BaseTest {
	
	

	//----------Object--Repo------------
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement email_txt_Box;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password_txt_Box;
	
	@FindBy(xpath = "//*[@class='btn btn-dark btn-block' and @type='submit']")
	private WebElement login_Button;
	
    
   public LoginPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//----Action---Method;
	
    public void verifyLogin () throws IOException, InterruptedException {
    	
  //	email_txt_Box.sendKeys(com.testData.PropertiesFileUse.propertiesfile("email"));
  	
     email_txt_Box.sendKeys(ReadDataExcel.readData(1, 0));
    	
 //  password_txt_Box.sendKeys(com.testData.PropertiesFileUse.propertiesfile("password"));
  	
  	password_txt_Box.sendKeys(ReadDataExcel.readData(1, 1));
           
	   login_Button.click();
	   
	  
  
    	
    	
    	
    }
   
	
}
