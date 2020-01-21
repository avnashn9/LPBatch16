package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.GenericMethods;

public class SalesEditPOM {
	private WebDriver driver; 
	
	public SalesEditPOM(WebDriver driver) {
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
		
   @FindBy(xpath="//span[contains(text(),'Sales')]")
	private WebElement Sales;
	
   @FindBy(xpath="//a[contains(text(),'Orders')]")
	private WebElement Orders; 
	
//   @FindBy(xpath="//i[@class='fa fa-pencil']")
//	private WebElement editbtn; 
//  
   @FindBy(xpath="//tr[2]//td[8]//a[2]")
   private WebElement editbtn; 
       
   @FindBy(xpath="//button[@id='button-customer']")
 	private WebElement btncontinue; 
   
//   @FindBy(xpath="//button[contains(text(),'Continue')]")
//	private WebElement btncontinue; 
//  
   @FindBy(xpath="//i[@class='fa fa-minus-circle']")
	private WebElement btnremove; 
 
   @FindBy(xpath="//input[@id='input-product']")
  	private WebElement chooseproduct; 
   
   @FindBy(xpath="//input[@id='input-quantity']")
 	private WebElement quantity; 
   
   @FindBy(xpath="//button[@id='button-product-add']")
	private WebElement addproduct1; 
  
   @FindBy(xpath="//button[@id='button-cart']")
	private WebElement addcontinue; 
 
   @FindBy(xpath="//button[@id='button-payment-address']")
	private WebElement paycontinue; 

   @FindBy(xpath="//button[@id='button-shipping-address']")
	private WebElement shipcontinue; 

   @FindBy(xpath="//select[@id='input-shipping-method']")
	private WebElement shipmethod; 
   
   @FindBy(xpath="//button[@id='button-save']")
	private WebElement savebtn; 

   
       
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

	public void clickSales(){
        GenericMethods.linkVisibility(Sales);
	}

    public void clickSalesOrders() {
		 GenericMethods.linkVisibility(Orders);
   }
    
    public void clickEditOrder() {
 		this.editbtn.click(); 
   }
    
    public void Clickcontinue1() {
 		this.btncontinue.click(); 
 	
   }
    
    public void Clickremove1() {
 		this.btnremove.click(); 
   }
    
    public void Enterchooseproduct(String chooseproduct) {
		GenericMethods.txtBoxVisibility(this.chooseproduct,chooseproduct);
    }	
	
    public void Enterquantity(String quantity) {
		GenericMethods.txtBoxVisibility(this.quantity,quantity);
    }	
	
    public void Addproduct1()  {
 		this.addproduct1.click();
 		
    }
    
    public void Clickaddcontinue() {
 		this.addcontinue.click(); 
   }
    
    public void Clickpaycontinue() {
  		this.paycontinue.click(); 
    }
     
    public void Clickshipcontinue() {
  		this.shipcontinue.click(); 
    }
     
    
    public void shipmethod() {
	Select sel = new Select(shipmethod);
	sel.deselectByVisibleText("Free Shipping - Rs.0");
    }
	
    public void Clicksave() {
  		this.savebtn.click(); 
    }
	       
}
