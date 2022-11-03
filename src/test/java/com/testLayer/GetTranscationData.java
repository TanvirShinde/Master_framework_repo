package com.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.LoginPage;
import com.pageLayer.Transactionpage;
import com.testBase.BaseTest;


public class GetTranscationData extends BaseTest {

	@Test
	public void getData() throws InterruptedException, IOException
	
	{
            lp = new LoginPage () ;
		    lp.verifyLogin();
		
		    tp = new Transactionpage();
		    
		Dashboardpage dash=new Dashboardpage();
		
		Thread.sleep(3000);
		
		dash.clickOnTransactionLink();
		
		Thread.sleep(3000);
		
		tp.getTransactionData();	
	}
}
