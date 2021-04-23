package com.techbee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectedProductPage extends Header {
	
	@FindBy(how = How.XPATH, using = "//img[@id='gh-logo']")
	WebElement ebayLogo;
	
	
	public SelectedProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void productDescriptionText() {
		
	}
	
	public void productPriceText() {
		
	}
	


}
