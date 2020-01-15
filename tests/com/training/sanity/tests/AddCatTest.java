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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddCatTest {

	private WebDriver driver;
	private String baseUrl;
	// private LoginPOM loginPOM;
	private AddCatProdPOM addCatProdPOM;
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
		addCatProdPOM = new AddCatProdPOM(driver);
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
		addCatProdPOM.sendUserName("admin");
		addCatProdPOM.sendPassword("admin@123");
		addCatProdPOM.clickLoginBtn();
		addCatProdPOM.clickMenu();
		addCatProdPOM.clickCatalog(); 
		addCatProdPOM.clickCategories();
		addCatProdPOM.clickAddNew(); 
		addCatProdPOM.enterCatName("AORNAMENTSAN2");
		addCatProdPOM.enterCatDesc("ornaments for ladies");
		addCatProdPOM.enterMetaTag("ORNAMENTSAN");
		addCatProdPOM.enterMetaTagDesc("ornaments for ladies");
		addCatProdPOM.clickData();
		addCatProdPOM.clickDesign();
		addCatProdPOM.clickSave();
		addCatProdPOM.clickProducts();
		addCatProdPOM.clickAddProdNew(); 
		addCatProdPOM.enterProdName("Finger Ring2");
		addCatProdPOM.enterProdMetaTag("Finger Ring for ladies");
		addCatProdPOM.clickProdModelData();
		addCatProdPOM.enterProdModel("SKU-013");
		addCatProdPOM.clickLinks();	
		addCatProdPOM.clickProdCategories();
		addCatProdPOM.displayCategory("AORNAMENTSAN2");
		addCatProdPOM.clickAttribute();	
	    addCatProdPOM.clickOption();	
		addCatProdPOM.clickRecurring();	
		addCatProdPOM.clickDiscount();	
		addCatProdPOM.clickSpecial();	
		addCatProdPOM.clickImage();	
		addCatProdPOM.clickRewardPoints();	
		addCatProdPOM.clickProdDesign();	
		addCatProdPOM.clickProdSave();	
		
		
	}
	
}
