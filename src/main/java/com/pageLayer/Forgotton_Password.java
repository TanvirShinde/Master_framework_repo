package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class Forgotton_Password  extends BaseTest {

	@FindBy(xpath = "//*[@name='email']")
	private WebElement email_txt_Box;
	
	@FindBy(xpath = "//*[@href='/forgot-password']")
	private WebElement forgot_pwd_link;
	
	
	public Forgotton_Password () {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void forgetPassword() throws InterruptedException {
		
		email_txt_Box.sendKeys("amarwaghmare573@gmail.com");
		
		Thread.sleep(2000);
		
		forgot_pwd_link.click();
	}
	
}
