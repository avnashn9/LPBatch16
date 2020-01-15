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
	
	@FindBy(xpath="//a[@id='button-menu']")
	private WebElement Menu;
	
	
@FindBy(xpath="//span[contains(text(),'Catalog')]")
	private WebElement Catalog;

	
@FindBy(xpath="//a[contains(text(),'Categories')]")
	private WebElement Categories;


	public void clickMenu() {
		this.Menu.click(); 
    }

	
	public void clickCatalog(){
    this.Catalog.click(); 

	}

 public void clickCategories() {
		this.Categories.click(); 
  
   }


}
