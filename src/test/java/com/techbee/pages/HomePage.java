package com.techbee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends Header{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(how=How.LINK_TEXT, 
			using="Saved") WebElement savedLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Motors") WebElement motorsLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Fashion") WebElement fashionLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Electronics") WebElement electronicsLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Collectibles & Art") WebElement collectiblesAndArtLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Home & Garden") WebElement homeAndGardenLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Sporting Goods") WebElement sportingGoodsLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Toys") WebElement toysLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Business & Industrial") WebElement businessAndIndustrialLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Music") WebElement musicLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Deals") WebElement dealsLink;
	@FindBy(how=How.XPATH, 
			using="//*[@id=\'items_list1\']/div[1]/div/div[1]/h2/a") 
					WebElement todaysDealsLink;
	@FindBy(how=How.XPATH,
			using="//select[@id='gh-cat']") WebElement searchByCategoryDropdown;
	@FindBy(how=How.XPATH,
			using="//input[@id='userid']") WebElement signInUsernameInput;
	@FindBy(how=How.XPATH,
			using="//button[@id='signin-continue-btn']") 
					WebElement continueToPasswordButton;
	@FindBy(how=How.XPATH,
			using="//input[@id='pass']") WebElement signInPasswordInput;
	@FindBy(how=How.XPATH,
			using="//button[@id='sgnBt']") WebElement signInButton;
	@FindBy(how=How.XPATH,
			using="//input[@id='gh-ac']]") WebElement searchInput;
	@FindBy(how=How.XPATH,
			using="//input[@id='gh-btn']]") WebElement searchButton;
	@FindBy(how=How.XPATH,
			using="//a[@id='gh-as-a']") WebElement advancedSearchLink;
	
	public void savedClick() {
		savedLink.click();
	}
	
	public void motorsClick() {
		motorsLink.click();
	}
	
	public void motorsExpand() {
		Actions action = new Actions(driver);
		WebElement we = motorsLink;
		action.moveToElement(we).perform();
		
	}
	
	public void fashionClick() {
		fashionLink.click();
	}
	
	public void fashionExpand() {
		Actions action = new Actions(driver);
		WebElement we = fashionLink;
		action.moveToElement(we).perform();
		
	}
	
	public void electronicsClick() {
		electronicsLink.click();
	}
	
	public void electronicsExpand() {
		Actions action = new Actions(driver);
		WebElement we = electronicsLink;
		action.moveToElement(we).perform();
		
	}
	
	public void collectiblesAndArtClick() {
		collectiblesAndArtLink.click();
	}
	
	public void collectiblesAndArtExpand() {
		Actions action = new Actions(driver);
		WebElement we = collectiblesAndArtLink;
		action.moveToElement(we).perform();
		
	}
	
	public void homeAndGardenClick() {
		homeAndGardenLink.click();
	}
	
	public void homeAndGardenExpand() {
		Actions action = new Actions(driver);
		WebElement we = homeAndGardenLink;
		action.moveToElement(we).perform();
		
	} 
	
	public void sportingGoodsClick() {
		sportingGoodsLink.click();
	}
	
	public void sportingGoodsExpand() {
		Actions action = new Actions(driver);
		WebElement we = sportingGoodsLink;
		action.moveToElement(we).perform();
		
	} 
	
	public void toysClick() {
		toysLink.click();
	}
	
	public void toysExpand() {
		Actions action = new Actions(driver);
		WebElement we = toysLink;
		action.moveToElement(we).perform();
		
	} 
	
	public void businessAndIndustrialClick() {
		businessAndIndustrialLink.click();
	}
	
	public void businessAndIndustrialExpand() {
		Actions action = new Actions(driver);
		WebElement we = businessAndIndustrialLink;
		action.moveToElement(we).perform();
		
	} 
	
	public void musicClick() {
		musicLink.click();
	}
	
	public void musicExpand() {
		Actions action = new Actions(driver);
		WebElement we = musicLink;
		action.moveToElement(we).perform();
		
	} 
	
	public void dealsClick() {
		dealsLink.click();
	}
	
	public void dealsExpand() {
		Actions action = new Actions(driver);
		WebElement we = dealsLink;
		action.moveToElement(we).perform();
		
	} 
	
	public void todaysDealsClick() {
		todaysDealsLink.click();
	}
	
	public void searchByCategoryDropdownClick() {
		searchByCategoryDropdown.click();
	}
	
	public void signInEnterUsername(String setUsername) {
		signInUsernameInput.sendKeys(setUsername);
	}
	
	public void continueToPasswordButtonClick() {
		continueToPasswordButton.click();
	}
	
	public void signInEnterPassword(String setPassword) {
		signInPasswordInput.sendKeys(setPassword);
	}
	
	public void signInButtonClick() {
		signInButton.click();
	}
	
	public void searchInputAndClick(String input) throws InterruptedException {
		searchInput.sendKeys(input);
	}
	
	public void searchButtonClick() {
		searchButton.click();
	}
	
	public void advancedSearchClick() {
		advancedSearchLink.click();
	}
	
}
