package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.pageLayer.LoginPage;
import com.testBase.BaseTest;

public class BuyScenarioOfStockCustomLimit extends BaseTest{
	
	String expected_msg = "Limit Order Created Successfully";
	
	@Test
	public void BuyShareWithCustomLimit() throws InterruptedException, IOException
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
		
		Thread.sleep(4000);
		
		ep.clickOnCustomLimit();
		
		ep.enterQuantity("10");
		
		ep.clickOnBuyButton2();
		
		Thread.sleep(4000);
		
		Assert.assertEquals(ep.getStatusMsgforCustomLimitOrder(), expected_msg);
		
	}


	
}
