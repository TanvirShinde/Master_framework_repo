package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.pageLayer.LoginPage;
import com.testBase.BaseTest;

public class BuyScenarioTest extends BaseTest{

	
	@Test(priority = 1)
	public void BuyShareWithCustomLimit() throws InterruptedException, IOException
	{
		String expected_msg = "Limit Order Created Successfully12456";
		
		logger.info("BuyShareWithCustomLimit");
		
		 lp = new LoginPage () ;
		
		lp.verifyLogin();
		
		 dp = new Dashboardpage();
		
		Thread.sleep(3000);
		
		dp.enterCompnayName("Axis");
		
		dp.clickOnCompanyOption();
		
		Thread.sleep(3000);
		
		 ep = new Exchangepage();
		
		 ep.clickOnBuyButton1();
		
		Thread.sleep(4000);
		
		ep.clickOnCustomLimit();
		
		ep.enterQuantity("10");
		
		ep.clickOnBuyButton2();
		
		Thread.sleep(4000);
		
		Assert.assertEquals(ep.getStatusMsgforCustomLimitOrder(), expected_msg);
		
		logger.info("StatusMsgforCustomLimitOrderVerified");
		}
	
	@Test(priority = 2)
	public void buyShareforLongTerm() throws InterruptedException, IOException
	{
		String expected_msg = "Order Created successfully";
		
		logger.info("buyShareforLongTerm");
		
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
		
		logger.info("StatusMsgforLongTermOrderVerified");
		
	}

}
