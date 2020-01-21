package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.pom.CatalogPOM;
//import com.training.pom.LoginPOM;
import com.training.pom.AddCatProdPOM;
import com.training.pom.SalesEditPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SalesEditTest {

	private WebDriver driver;
	private String baseUrl;
	// private LoginPOM loginPOM;
	private SalesEditPOM saleseditPOM;
	private static Properties properties;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
	//	driver = DriverFactory.getDriver(DriverNames.CHROME);
	    driver = DriverFactory.getDriver(DriverNames.FIREFOX);
	  //  loginPOM = new LoginPOM(driver);
	    saleseditPOM = new SalesEditPOM(driver);
	   
	   
		baseUrl = properties.getProperty("baseURL");
		// open the browser 
		driver.get(baseUrl);
	}
	
/*	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	*/
	
	@Test
	public void AddCategoryTest() throws InterruptedException   
	{
		saleseditPOM.sendUserName("admin");
		saleseditPOM.sendPassword("admin@123");
		saleseditPOM.clickLoginBtn();
		saleseditPOM.clickMenu();
		saleseditPOM.clickSales(); 
		saleseditPOM.clickSalesOrders();
		saleseditPOM.clickEditOrder(); 
		Thread.sleep(10000);
		saleseditPOM.Clickcontinue1();
		saleseditPOM.Clickremove1();
		Thread.sleep(10000);
	    saleseditPOM.Enterchooseproduct("Finger Ring");
	    saleseditPOM.Enterquantity("1");
	    Thread.sleep(5000);
	    saleseditPOM.Addproduct1();
	    Thread.sleep(10000);
        saleseditPOM.Clickaddcontinue();
		saleseditPOM.Clickpaycontinue();
		saleseditPOM.Clickshipcontinue();
		saleseditPOM.shipmethod();
		saleseditPOM.Clicksave();
		
	}
	
}
