package com.techbee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header extends Footer {

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//img[@id='gh-logo']")
	WebElement ebayLogo;
	@FindBy(how = How.LINK_TEXT, using = "Sign In")
	WebElement signInLink;
	@FindBy(how = How.LINK_TEXT, using = "Register")
	WebElement registerLink;
	@FindBy(how = How.LINK_TEXT, using = "Daily Deals")
	WebElement dailyDealsLink;
	@FindBy(how = How.LINK_TEXT, using = "Brand Outlet")
	WebElement brandOutletLink;
	@FindBy(how = How.LINK_TEXT, using = "Help & Contact")
	WebElement helpAndContactLink;
	@FindBy(how = How.LINK_TEXT, using = "Sell")
	WebElement sellLink;
	@FindBy(how = How.LINK_TEXT, using = "Watchlist")
	WebElement watchlistDropdown;
	@FindBy(how = How.LINK_TEXT, using = "My eBay")
	WebElement myEbayDropdown;
	@FindBy(how = How.XPATH, using = "//i[@id='gh-Alerts-i']")
	WebElement notifiactionBellLink;
	@FindBy(how = How.XPATH, using = "//*[@id=\'gh-minicart-hover\']/div/a[1]/svg")
	WebElement shoppingCartLink;
	

	public Header(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void homeLogoClick() {
		ebayLogo.click();
	}

	public void signInClick() {
		signInLink.click();
	}

	public void registerClick() {
		registerLink.click();
	}

	public void dailyDealsClick() {
		dailyDealsLink.click();
	}

	public void brandOutletClick() {
		brandOutletLink.click();
	}

	public void helpAndContactClick() {
		helpAndContactLink.click();
	}

	public void Sell() {
		sellLink.click();
	}

	public void watchListClick() {
		watchlistDropdown.click();
	}

	public void MyEbayLinkHover() {
		Actions action = new Actions(driver);
		WebElement we = myEbayDropdown;
		action.moveToElement(we).perform();
	}

	public void MyEbayClick() {
		myEbayDropdown.click();
	}

	public void notificationBellClick() {
		notifiactionBellLink.click();
	}

	

}
