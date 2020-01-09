package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
private WebDriver driver; 
	
	public HomePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	@Findby(name="keyword")
	private WebElement keywordTxtBox;
	
	
}