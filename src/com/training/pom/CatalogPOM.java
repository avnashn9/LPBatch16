package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPOM {
	private WebDriver driver; 
	
	public CatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
/*	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
*/
	@FindBy(xpath="//a[@id='button-menu']")
	private WebElement Menu;
	
	
@FindBy(xpath="//span[contains(text(),'Catalog')]")
	private WebElement Catalog;

	
@FindBy(xpath="//a[contains(text(),'Categories')]")
	private WebElement Categories;


//	@FindBy(xpath="//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu-catalog']/a[1]")
//	private WebElement Catalog;
	
/*	@FindBy(xpath="//span[contains(text(),'Catalog')]")
	private WebElement Categories;
		*/
//	@FindBy(xpath="//a[contains(text(),'Categories')")
//	private WebElement Categories; 
	
/*
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
    }
	
	*/
	public void clickMenu() {
		this.Menu.click(); 
    }

	
	public void clickCatalog(){
    this.Catalog.click(); 

		/*
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		*/
	}

 public void clickCategories() {
		this.Categories.click(); 
  
   }


}
