package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.pageLayer.LoginPage;
import com.testBase.BaseTest;

public class SellScenarioOfStockLongTerm extends BaseTest{
	
	String expected_msg = "Order Created successfully";
	
	@Test
	public void SellShareforLongTerm() throws InterruptedException, IOException
	{
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
		
	}


	
}
