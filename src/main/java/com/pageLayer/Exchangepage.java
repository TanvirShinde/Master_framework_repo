package com.pageLayer;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;


public class Exchangepage extends BaseTest  {

	public Exchangepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------obj repo -----------------
	private By search_for_company_txt_box= By.xpath("//input[@placeholder='Search for Company name']");
	
	private By select_for_company= By.xpath("//a[contains(text(),'HDFC.NS')]");
	
	
	private By buy_btn1 = By.xpath("//*[@class='active nav-link']");
	
	private By sell_btn1 = By.xpath("//a[contains(text(),'Sell')]");
	
	//private By custom_limit_button = By.xpath("(//*[@class='btn btn-outline-secondary'])[4]");
	
	private By custom_limit_button = By.xpath("((//*[@class='btn-group mb-2'])[2]//label)[2]");
	
	
	private By quantity_txtbox = By.xpath("//*[@name='input-Qunatity']");
	
	private By quantity_txtbox_sell = By.xpath("//input[@id='quantity']");
	
	private By buy_btn2 = By.xpath("//button[@class='w-md btn btn-success']");
	
	private By status = By.xpath("//div[text()='Order Created successfully']");
	
	private By status_for_custom_order = By.xpath("//div[contains(text(),'Limit Order Created Successfully')]");
	
	private By sell_btn2 = By.xpath("//button[contains(text(),'Sell')]");
	
	//----------action methods-------------
	public void search_for_company(){
		
		WebElement txt_box = driver.findElement(search_for_company_txt_box);
		txt_box.click();
		txt_box.sendKeys("hdfc");
		}
	
	public void selectofCompany () {
		
		driver.findElement(select_for_company).click();
	}
	
	public void clickOnBuyButton1()
	{
		driver.findElement(buy_btn1).click();
	}
	
	public void clickonSellButton1() {
		
		driver.findElement(sell_btn1).click();
	}
	
	public void clickOnCustomLimit () {
		
          driver.findElement(custom_limit_button).click();	
	}
	public void enterQuantity(String count)
	{
		WebElement quantity=driver.findElement(quantity_txtbox);
		
		quantity.click();
		
		quantity.sendKeys(count);
	}
	
	public void enterQuantityForSell (String count) {
		
		WebElement quantitySell = driver.findElement(quantity_txtbox_sell);
		
		quantitySell.click();
		
		quantitySell.sendKeys(count);
	}
	
	public void clickonSellButton2() {
		
		driver.findElement(sell_btn2).click();
	}
	public void clickOnBuyButton2()
	{
		driver.findElement(buy_btn2).click();
	}
	
	public String getStatusMsg()
	{
		String msg = driver.findElement(status).getText();
		return msg;
	}
	
	public String getStatusMsgforCustomLimitOrder () {
		
	   String msg1 = driver.findElement(status_for_custom_order).getText();
	   
	   return msg1;
	}
}
