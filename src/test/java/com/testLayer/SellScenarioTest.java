package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.pageLayer.LoginPage;
import com.testBase.BaseTest;

public class SellScenarioTest extends BaseTest{

	@Test(priority=3)
	public void SellSharewithCustomLimit() throws InterruptedException, IOException
	{
		String expected_msg = "Limit Order Created Successfully";
		
		logger.info("SellSharewithCustomLimit");
		lp = new LoginPage () ;
		lp.verifyLogin();
		dp = new Dashboardpage();
		Thread.sleep(3000);
		dp.enterCompnayName("Axis");
		dp.clickOnCompanyOption();
		Thread.sleep(3000);
		 ep = new Exchangepage();
		ep.clickOnBuyButton1();
		Thread.sleep(2000);
		ep.clickOnCustomLimit();
		ep.enterQuantity("8");
		ep.clickOnBuyButton2();
		Thread.sleep(4000);
		Assert.assertEquals(ep.getStatusMsgforCustomLimitOrder(), expected_msg);
		logger.info("StatusMsgforSellSharewithCustomLimitVerified");
		
	}

	@Test(priority=4)
	public void SellShareforLongTerm() throws InterruptedException, IOException
	{
		String expected_msg = "Order Created successfully234567";
		logger.info("SellShareforLongTerm");
		LoginPage lp = new LoginPage () ;
		lp.verifyLogin();
		Dashboardpage dash = new Dashboardpage();
		Thread.sleep(3000);
		dash.enterCompnayName("Axis");
		Thread.sleep(2000);
		dash.clickOnCompanyOption();
		Thread.sleep(3000);
		Exchangepage ep = new Exchangepage () ;
		ep.clickonSellButton1();
		Thread.sleep(2000);
		ep.enterQuantityForSell("6");
		ep.clickonSellButton2();
		Thread.sleep(4000);
		Assert.assertEquals(ep.getStatusMsg(), expected_msg);
		logger.info("StatusMsgforSellShareforLongTermVerified");
		
	}

}
