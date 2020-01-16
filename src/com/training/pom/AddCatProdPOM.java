package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.GenericMethods;

public class AddCatProdPOM {
	private WebDriver driver; 
	
	public AddCatProdPOM(WebDriver driver) {
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
	
   @FindBy(xpath="//a[contains(text(),'Categories')]")
	private WebElement Categories; 
	
   @FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnewbtn; 
   
   @FindBy(xpath="//input[@id='input-name1']")
	private WebElement catname; 
  
   @FindBy(xpath="//div[@class='note-editable panel-body']")
	private WebElement catdesc; 
   
   @FindBy(xpath="//input[@id='input-meta-title1']")
  	private WebElement metatag; 
   
   @FindBy(xpath="//textarea[@id='input-meta-description1']")
	private WebElement metatagdesc; 
   
   @FindBy(xpath="//a[contains(text(),'Data')]")
 	private WebElement Data; 
   
   @FindBy(xpath="//a[contains(text(),'Design')]")
	private WebElement Design; 
   
   @FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement Save; 
   
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
    
    @FindBy(xpath="//a[contains(text(),'Links')]")
 	private WebElement Links; 
    
    @FindBy(xpath="//input[@id='input-category']")
	private WebElement ProdCategories; 
    
    @FindBy(xpath="//a[@href='#tab-attribute']")
 	private WebElement Attribute; 


    @FindBy(xpath="//a[@href='#tab-option']")
 	private WebElement Option; 
    
    @FindBy(xpath="//a[@href='#tab-recurring']")
 	private WebElement Recurring; 
    
    @FindBy(xpath="//a[@href='#tab-discount']")
 	private WebElement Discount; 
    
    @FindBy(xpath="//a[@href='#tab-special']")
 	private WebElement Special; 

    @FindBy(xpath="//a[@href='#tab-image']")
 	private WebElement Image; 
    
    @FindBy(xpath="//a[@href='#tab-reward']")
 	private WebElement RewardPoints; 
    
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
    this.Catalog.click(); 
    GenericMethods.linkVisibility(Catalog);
	}

    public void clickCategories() {
		this.Categories.click(); 
		 GenericMethods.linkVisibility(Categories);
   }
    
    public void clickAddNew() {
 		this.addnewbtn.click(); 
   }
    
    public void enterCatName(String catname) {
		this.catname.clear();
		this.catname.sendKeys(catname);
		GenericMethods.txtBoxVisibility(this.catname,catname);
    }	
	
    public void enterCatDesc(String catdesc) {
			this.catdesc.clear();
			this.catdesc.sendKeys(catdesc);
			GenericMethods.txtBoxVisibility(this.catdesc,catdesc);
	}
	
	public void enterMetaTag(String metatag) {
		this.metatag.clear();
		this.metatag.sendKeys(metatag);
		GenericMethods.txtBoxVisibility(this.metatag,metatag);
	}
	
	public void enterMetaTagDesc(String metatagdesc) {
		this.metatagdesc.clear();
		this.metatagdesc.sendKeys(metatagdesc);
		GenericMethods.txtBoxVisibility(this.metatagdesc,metatagdesc);
      }
	
	  public void clickData() {
			this.Data.click(); 
			GenericMethods.linkVisibility(Data);
	   }
	
	  public void clickDesign() {
			this.Design.click(); 
			GenericMethods.linkVisibility(Design);
	   }
	  
	  public void clickSave() {
			this.Save.click(); 
	   }

	  public void clickProducts(){
		    this.Products.click(); 
		    GenericMethods.linkVisibility(Products);
			}
	  
	  public void clickAddProdNew() {
	 		this.addnewprodbtn.click(); 
	 	 }
	  
	  public void enterProdName(String prodname) {
			this.prodname.clear();
			this.prodname.sendKeys(prodname);
			GenericMethods.txtBoxVisibility(this.prodname,prodname);
	    }	
		
	   public void enterProdMetaTag(String prodmetatag) {
			this.prodmetatag.clear();
			this.prodmetatag.sendKeys(prodmetatag);
			GenericMethods.txtBoxVisibility(this.prodmetatag,prodmetatag);
		}
	   
	   public void clickProdModelData()    {
			this.ProdData.click(); 
			GenericMethods.linkVisibility(ProdData);

	   }
	   
	   public void enterProdModel(String ProdModelData) {
			this.ProdModelData.clear();
			this.ProdModelData.sendKeys(ProdModelData);
			GenericMethods.txtBoxVisibility(this.ProdModelData,ProdModelData);
		}
	    
	   public void clickLinks() {
			this.Links.click(); 
			GenericMethods.linkVisibility(Links);
	   }
	   
	   public void clickProdCategories() throws InterruptedException {
			this.ProdCategories.click(); 
			GenericMethods.linkVisibility(Catalog);
			Thread.sleep(10000);
		}
	  
	   public void displayCategory(String ProdCategories) throws InterruptedException {
			this.ProdCategories.clear();
			this.ProdCategories.sendKeys(ProdCategories);
			GenericMethods.txtBoxVisibility(this.ProdCategories,ProdCategories);
			Thread.sleep(10000);
		}
	   
	   public void clickAttribute() throws InterruptedException {
			this.Attribute.click(); 
			GenericMethods.linkVisibility(Attribute);
			Thread.sleep(10000);
	   }
	
	   
	   public void clickOption() {
			this.Option.click(); 
			GenericMethods.linkVisibility(Option);
	   }
	   
	   public void clickRecurring() {
			this.Recurring.click(); 
			GenericMethods.linkVisibility(Recurring);
	   }
	   
	   public void clickDiscount() {
			this.Discount.click();
			GenericMethods.linkVisibility(Discount);
	   }
	   
	   
	   public void clickSpecial() {
			this.Special.click(); 
			GenericMethods.linkVisibility(Special);
	   }
	   
	   public void clickImage() {
			this.Image.click(); 
			GenericMethods.linkVisibility(Image);
	   }
	   
	   public void clickRewardPoints() {
			this.RewardPoints.click(); 
			GenericMethods.linkVisibility(RewardPoints);
	   }
	   
	   public void clickProdDesign() {
			this.ProdDesign.click(); 
			GenericMethods.linkVisibility(ProdDesign);
	   }
	   
	   public void clickProdSave() {
			this.ProdSave.click(); 
	   }
	       
}
