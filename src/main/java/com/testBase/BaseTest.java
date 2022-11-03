package com.testBase;


import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.pageLayer.LoginPage;
import com.pageLayer.Transactionpage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver ;
	
	public static LoginPage lp;
	public static Dashboardpage dp;
	public static Exchangepage ep;
	public static Transactionpage tp;
	
	public static Logger logger;
	
	
	String browser = "Chrome";
	
	
	    @BeforeMethod
	   public void openBrowser () throws IOException, InterruptedException {
		   
		   if (browser.equalsIgnoreCase("Chrome")) 
		   {
			   WebDriverManager.chromedriver().setup();
			   
			   driver = new ChromeDriver();
			   
		   }
		   
		   else if (browser.equalsIgnoreCase("firefox")) {
			   
			   WebDriverManager.firefoxdriver().setup();
			   
			   driver = new FirefoxDriver();
		   }
		   
          else if (browser.equalsIgnoreCase("Edge")) {
			   
			   WebDriverManager.edgedriver().setup();
			   
			   driver = new EdgeDriver();
		   }
		   
          else {
        	  
        	  System.out.println("Choose Correct browser");
          }
		   
		   
		   driver.manage().window().maximize();
		   
       driver.get(com.testData.PropertiesFileUse.propertiesfile("abc"));
		   
       driver.manage().window().maximize();
		     
			 driver.manage().deleteAllCookies();
			 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		   
		
		  lp = new LoginPage();
		   
		   dp = new Dashboardpage () ;
		   
		  ep = new Exchangepage () ;
		   
		  tp = new Transactionpage ();
		   
		   
		   
	   }

	
          @AfterMethod    
	      public void tearDown () throws InterruptedException {
	    	  
	    	  Thread.sleep(4000);
	    	  
	    	  driver.quit();
	      }
          
          @BeforeClass
      	public void start()
      	{
      		logger = Logger.getLogger("Dalal Street Framework");
      		PropertyConfigurator.configure("logDalal.properties");
      		
      	
      	}
      	
      	@AfterClass
      	public void stop()
      	{
      		
      	}
}
