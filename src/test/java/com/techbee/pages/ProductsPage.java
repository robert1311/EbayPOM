package com.techbee.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsPage extends HomePage {

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'All Listings')]")
	WebElement allListngsTab;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Accepts Offers')]")
	WebElement acceptOffersTab;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Auction')]")
	WebElement auctionTab;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Buy It Now')]")
	WebElement buyItNowTab;
	@FindBy(how = How.XPATH, using = "//*[@id=\"nid-HX4-13\"]/button")
	WebElement conditionDropdown;
	@FindBy(how = How.XPATH, using = "//div[@id='x-refine__group__3']/ul/li[1]/div/a/div/span/input")
	WebElement priceRange1;
	@FindBy(how = How.XPATH, using = "//div[@id='x-refine__group__3']/ul/li[2]/div/a/div/span/input")
	WebElement priceRange2;
	@FindBy(how = How.XPATH, using = "//div[@id='x-refine__group__3']/ul/li[3]/div/a/div/span/input")
	WebElement priceRange3;
	@FindBy(how = How.XPATH, using = "//input[label*='Minimum Value in $']")
	WebElement priceRangeMinInput;
	@FindBy(how = How.XPATH, using = "//input[label*='Maximum Value in $']")
	WebElement priceRangeMaxInput;
	@FindBy(how = How.XPATH, using = "//*[@id=\"srp-river-results\"]/ul")
	WebElement searchResultsList;
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	public String searchResultText() {
		return searchInput.getText();
	}

	public void allListingsTabClick() {
		allListngsTab.click();
	}
	
	public void acceptOffersClick() {
		acceptOffersTab.click();
	}
	
	public void auctionTabClick() {
		auctionTab.click();
	}
	
	public void buyItNowTabClick() {
		buyItNowTab.click();
	}
	
	public void conditionDropdownSelect() {
		conditionDropdown.click();
	}
	
	public void priceRange1Mark() {
		priceRange1.click();
	}
	
	public void priceRange2Mark() {
		priceRange2.click();
	}
	
	public void priceRange3Mark() {
		priceRange3.click();
	}
	
	public String searchResultsListItemDescription(int index) {
		return searchResultsList.findElement(By.xpath(
				"//*[@id=\'srp-river-results\']/ul/li[" 
		+ index + "]/div/div[2]/a/h3")).getText();
	}
	
	public String searchResultsItemPrice(int index) {
		return searchResultsList.findElement(By.xpath(
				"//*[@id=\"srp-river-results\"]/ul/li[" 
		+ index + "]/div/div[2]/div[5]/div[1]/span")).getText();
	}
	
	
	
	
}
