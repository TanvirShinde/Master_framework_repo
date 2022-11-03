package com.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageLayer.LoginPage;
import com.pageLayer.TransactionClass;
import com.testBase.BaseTest;

public class TransactionTest extends BaseTest{

    @Test
	public void transactionDetails() throws IOException, InterruptedException {
		
    LoginPage lp = new LoginPage () ;
		
		lp.verifyLogin();
		
		Thread.sleep(4000);
		
		TransactionClass tc = new TransactionClass () ;
		
		tc.clickOnTransactionLink();
		
		Thread.sleep(4000);
		
		tc.printTransactionData();
		
		Thread.sleep(4000);
		
		tc.createExcelData();
	}
	
}
