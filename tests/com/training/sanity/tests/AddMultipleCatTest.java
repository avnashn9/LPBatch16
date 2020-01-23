package com.training.sanity.tests;

import java.awt.AWTException;
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
import com.training.pom.AddMultipleCatProdPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddMultipleCatTest {

	private WebDriver driver;
	private String baseUrl;
	// private LoginPOM loginPOM;
	private AddMultipleCatProdPOM addmultipleCatProdPOM;
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
	//	loginPOM = new LoginPOM(driver);
	    addmultipleCatProdPOM = new AddMultipleCatProdPOM(driver);
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
	public void AddMultipleCategoryTest() throws InterruptedException, AWTException   
	{
		addmultipleCatProdPOM.sendUserName("admin");
		addmultipleCatProdPOM.sendPassword("admin@123");
		addmultipleCatProdPOM.clickLoginBtn();
		addmultipleCatProdPOM.clickMenu();
		addmultipleCatProdPOM.clickCatalog(); 
		addmultipleCatProdPOM.clickProducts();
		addmultipleCatProdPOM.clickAddProdNew(); 
		addmultipleCatProdPOM.enterProdName("Finger Ring6");
		addmultipleCatProdPOM.enterProdMetaTag("Finger Ring for ladies");
		addmultipleCatProdPOM.clickProdModelData();
		addmultipleCatProdPOM.enterProdModel("SKU-013");
		addmultipleCatProdPOM.enterProdModelPrice("100");
		addmultipleCatProdPOM.enterProdModelQuantity("10");
		addmultipleCatProdPOM.clickLinks();
		addmultipleCatProdPOM.clickCategoryClick();
		addmultipleCatProdPOM.selectCategory();
		addmultipleCatProdPOM.clickAttribute();	
		addmultipleCatProdPOM.clickOption();	
	    addmultipleCatProdPOM.clickRecurring();	
		addmultipleCatProdPOM.clickDiscount();	
		addmultipleCatProdPOM.clickAddDiscountNew(); 
		addmultipleCatProdPOM.enterProdDiscountQuantity("10");
		addmultipleCatProdPOM.enterProdDiscountPrice("200");
		addmultipleCatProdPOM.clickSpecial();	
		addmultipleCatProdPOM.clickImage();	
		addmultipleCatProdPOM.clickRewardPoints();
		addmultipleCatProdPOM.enterRewardPoints("10");
		addmultipleCatProdPOM.clickProdDesign();	
		addmultipleCatProdPOM.clickProdSave();	
				
	}
	
}
