package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.pageLayer.LoginPage;
import com.testBase.BaseTest;
import com.utility.ScrollUpScrollDown;

public class BuyScenarioOfNSE extends BaseTest {
	
	String expected_msg = "Limit Order Created Successfully";
	
    @Test
	public void buyShareWithCustomPrice () throws IOException, InterruptedException {
    	
    	
		
         lp = new LoginPage () ;
		
		   lp.verifyLogin();
		   
		   Thread.sleep(4000);
		   
    dp = new Dashboardpage () ;
		   
		   dp.clickOnExchangeTab();
		   
		   Thread.sleep(7000);
		   
	 ep = new Exchangepage () ;
		
		ep.search_for_company();
		
		 Thread.sleep(4000);
		 
		 ep.selectofCompany();
		 
		 Thread.sleep(2000);
		 
		 ep.clickOnBuyButton1();
		 
		 ep.clickOnCustomLimit();
		 
		 Thread.sleep(2000);
		 
		 ep.enterQuantity("10");
		 
		 ep.clickOnBuyButton2();
		 
		 Thread.sleep(4000);
			
	Assert.assertEquals(ep.getStatusMsgforCustomLimitOrder(), expected_msg);
			
		 System.out.println("statement added");
		 
		 
		
		
	}
}
