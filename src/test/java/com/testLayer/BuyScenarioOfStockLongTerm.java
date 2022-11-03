package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.pageLayer.LoginPage;
import com.testBase.BaseTest;

public class BuyScenarioOfStockLongTerm extends BaseTest{
	
	String expected_msg = "Order Created successfully";
	
	@Test
	public void buyShareforLongTerm() throws InterruptedException, IOException
	{
		 lp = new LoginPage () ;
		
		lp.verifyLogin();
		
	dp = new Dashboardpage();
		
		Thread.sleep(3000);
		
		dp.enterCompnayName("Axis");
		
		dp.clickOnCompanyOption();
		
		Thread.sleep(3000);
		
	ep = new Exchangepage();
		
		ep.clickOnBuyButton1();
		
		ep.enterQuantity("2");
		
		ep.clickOnBuyButton2();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(ep.getStatusMsg(), expected_msg);
		
	}


	
}
