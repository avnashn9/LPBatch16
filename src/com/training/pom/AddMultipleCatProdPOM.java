package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.GenericMethods;

public class AddMultipleCatProdPOM {
	private WebDriver driver; 
	
	public AddMultipleCatProdPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@id='button-menu']")
	private WebElement Menu;
		
   @FindBy(xpath="//span[contains(text(),'Catalog')]")
	private WebElement Catalog;
   
   @FindBy(xpath="//a[contains(text(),'Products')]")
	private WebElement Products; 
   
   @FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnewprodbtn;
   
   @FindBy(xpath="//input[@id='input-name1']")
  	private WebElement prodname; 
    
    @FindBy(xpath="//input[@id='input-meta-title1']")
    	private WebElement prodmetatag; 
    
    @FindBy(xpath="//a[contains(text(),'Data')]")
 	private WebElement ProdData; 
    
    @FindBy(xpath="//input[@id='input-model']")
   	private WebElement ProdModelData; 
    
    @FindBy(xpath="//input[@id='input-price']")
   	private WebElement ProdModelPrice; 
      
    @FindBy(xpath="//input[@id='input-quantity']")
   	private WebElement ProdModelQuantity; 
        
    @FindBy(xpath="//a[contains(text(),'Links')]")
 	private WebElement Links; 
    
    @FindBy(xpath="//input[@id='input-category']")
	private WebElement ProdCategories; 
        
    @FindBy(xpath="//a[contains(text(),'AORNAMENTSAN')]]")
   	private WebElement SelectCategory; 
       
       
    @FindBy(xpath="//a[@href='#tab-attribute']")
 	private WebElement Attribute; 


    @FindBy(xpath="//a[@href='#tab-option']")
 	private WebElement Option; 
    
    @FindBy(xpath="//a[@href='#tab-recurring']")
 	private WebElement Recurring; 
    
    @FindBy(xpath="//a[@href='#tab-discount']")
 	private WebElement Discount; 
    
    @FindBy(xpath="//table[@id='discount']//i[@class='fa fa-plus-circle']")
	private WebElement addnewdiscountbtn;
    
    @FindBy(xpath="//td[@class='text-right']//input[@placeholder='Quantity']")
  	private WebElement DiscountQuantity; 
   
    @FindBy(xpath="//td[@class='text-right']//input[@placeholder='Price']")
  	private WebElement DiscountPrice; 
       
    @FindBy(xpath="//a[@href='#tab-special']")
 	private WebElement Special; 

    @FindBy(xpath="//a[@href='#tab-image']")
 	private WebElement Image; 
    
    @FindBy(xpath="//a[@href='#tab-reward']")
 	private WebElement RewardPoints; 
    
    @FindBy(xpath="//input[@id='input-points']")
  	private WebElement EnterRewardPoints; 
    
    @FindBy(xpath="//a[@href='#tab-design']")
 	private WebElement ProdDesign; 
    
    @FindBy(xpath="//button[@class='btn btn-primary']")
  	private WebElement ProdSave; 
     
  
    
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
	
	public void clickMenu() {
		this.Menu.click(); 
		
    }

	public void clickCatalog(){
        GenericMethods.linkVisibility(Catalog);
	}

	  public void clickProducts(){
	    GenericMethods.linkVisibility(Products);
			}
	  
	  public void clickAddProdNew() {
	 		this.addnewprodbtn.click(); 
	 	 }
	  
	  public void enterProdName(String prodname) {
			GenericMethods.txtBoxVisibility(this.prodname,prodname);
	    }	
		
	   public void enterProdMetaTag(String prodmetatag) {
			GenericMethods.txtBoxVisibility(this.prodmetatag,prodmetatag);
		}
	   
	   public void clickProdModelData()    {
			GenericMethods.linkVisibility(ProdData);

	   }
	   
	   public void enterProdModel(String ProdModelData) {
			GenericMethods.txtBoxVisibility(this.ProdModelData,ProdModelData);
		}
	   
	   public void enterProdModelPrice(String ProdModelPrice) {
			GenericMethods.txtBoxVisibility(this.ProdModelPrice,ProdModelPrice);
		}
	    
	   public void enterProdModelQuantity(String ProdModelQuantity) {
			GenericMethods.txtBoxVisibility(this.ProdModelQuantity,ProdModelQuantity);
		}
	   
	   public void clickLinks() { 
			GenericMethods.linkVisibility(Links);
	   }
	   	   
	      
	   public void clickCategoryClick() throws InterruptedException { 
				GenericMethods.linkVisibility(ProdCategories);
				Thread.sleep(10000);
		   }
	   
   
	   public void selectCategory() throws AWTException { 
		   	   Robot robot = new Robot();
		   	   robot.keyPress(KeyEvent.VK_TAB);
		   	   robot.keyPress(KeyEvent.VK_ENTER);
		   		
	   }
	   
	   
	   
	   public void clickAttribute() throws InterruptedException {
			GenericMethods.linkVisibility(Attribute);
			Thread.sleep(10000);
	   }
	
	   
	   public void clickOption() {
			GenericMethods.linkVisibility(Option);
	   }
	   
	   public void clickRecurring() {
			GenericMethods.linkVisibility(Recurring);
	   }
	   
	   public void clickDiscount() {
			GenericMethods.linkVisibility(Discount);
	   }
	   
	   public void clickAddDiscountNew() {
	 		this.addnewdiscountbtn.click(); 
	 	 }
	   
	   public void enterProdDiscountQuantity(String DiscountQuantity) {
			GenericMethods.txtBoxVisibility(this.DiscountQuantity,DiscountQuantity);
		}
	    
	   public void enterProdDiscountPrice(String DiscountPrice) {
			GenericMethods.txtBoxVisibility(this.DiscountPrice,DiscountPrice);
		}
	   
	   
	   public void clickSpecial() {
			GenericMethods.linkVisibility(Special);
	   }
	   
	   public void clickImage() {
			GenericMethods.linkVisibility(Image);
	   }
	   
	   public void clickRewardPoints() {
			GenericMethods.linkVisibility(RewardPoints);
	   }
	   
	   public void enterRewardPoints(String EnterRewardPoints) {
			GenericMethods.txtBoxVisibility(this.EnterRewardPoints,EnterRewardPoints);
		}
	   
	   public void clickProdDesign() {
			GenericMethods.linkVisibility(ProdDesign);
	   }
	   
	   public void clickProdSave() {
			this.ProdSave.click(); 
	   }
	       
}
