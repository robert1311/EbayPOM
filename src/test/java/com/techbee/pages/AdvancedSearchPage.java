package com.techbee.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchPage extends Header {

	WebDriver driver;

	public AdvancedSearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//td[@id='gh-title']") 
	WebElement pageTitle;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Find items')]") 
	WebElement findItemsLink;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'On eBay Motors')]") 
	WebElement onEbayMotorsLink;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'By seller')]") 
	WebElement bySellersLink;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'By item number')]") 
	WebElement byItemNumberLink;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Items in stores')]") 
	WebElement itemsInStoresLink;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Find Stores')]") 
	WebElement findStoresLink;
	@FindBy(how=How.XPATH, using="//input[@id='_nkw']")
	WebElement enterKeywordInput;
	@FindBy(how=How.XPATH, using="//select[@id='_in_kw']") 
	WebElement keywordDropdown;
	@FindBy(how=How.XPATH, using="//input[@id='_ex_kw']") 
	WebElement excludeKeywordInput;
	@FindBy(how=How.XPATH, using="//select[@id='e1-1']") 
	WebElement inThisCategoryDropdown;
	@FindBy(how=How.XPATH, using="//*[@id=\'adv_search_from\']/fieldset[1]/div[3]/button") 
	WebElement searchButton;
	@FindBy(how=How.XPATH, using="//input[@id='LH_TitleDesc']") 
	WebElement titleDesriptionCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_Complete']") 
	WebElement completedListingsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_Sold']") 
	WebElement SoldListingsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='_mPrRngCbx']") 
	WebElement showItemsPricedFromCheckBox;
	@FindBy(how=How.CSS, using="//input[@name*='_udlo']") 
	WebElement loPriceInput;
	@FindBy(how=How.CSS, using="//input[@name*='_udlhi']") 
	WebElement hiPriceInput;
	@FindBy(how=How.XPATH, using="//input[@id='LH_Auction']") 
	WebElement auctionCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_BIN']") 
	WebElement BuyItNowCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_CAds']") 
	WebElement classifiedAdsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_ItemConditionNew']") 
	WebElement newCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_ItemConditionUsed']") 
	WebElement usedCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_ItemConditionNS']") 
	WebElement NotSpecifiedCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_Time']") 
	WebElement listingsCheckBox;
	@FindBy(how=How.XPATH, using="//select[aria-label*='Listing options']") 
	WebElement listingOptinsDropdown;
	@FindBy(how=How.XPATH, using="//select[aria-label*='Time frame']") 
	WebElement listingsTimeFrameDropdown;
	@FindBy(how=How.XPATH, using="//input[@id='LH_NOB']") 
	WebElement numOfBidsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='_sabdlo']") 
	WebElement loBidsInput;
	@FindBy(how=How.XPATH, using="//input[@id='_sabdhi']") 
	WebElement hiBidsInput;
	@FindBy(how=How.XPATH, using="//input[@id='LH_MIL']") 
	WebElement multipleItemListingsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='_samilow']") 
	WebElement minItemsInput;
	@FindBy(how=How.XPATH, using="//input[@id='_samihi']") 
	WebElement maxItemsInput;
	@FindBy(how=How.XPATH, using="//input[@id='LH_Lots']") 
	WebElement itemsListedAsLotsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_SaleItems']") 
	WebElement saleItemsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_BO']") 
	WebElement bestOfferCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_Charity']") 
	WebElement eBayForCharityCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_FS']") 
	WebElement freeShippingCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_LPickup']") 
	WebElement localPickUpCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_Located']") 
	WebElement locatedRadioInput;
	@FindBy(how=How.XPATH, using="//select[@id='_sadis']") 
	WebElement milesDropdown;
	@FindBy(how=How.XPATH, using="//input[@id='_stpos']") 
	WebElement zipcodeInput;
	@FindBy(how=How.XPATH, using="//input[@id='LH_PrefLocRadio']") 
	WebElement preferredLocationsRadioInput;
	@FindBy(how=How.XPATH, using="//select[@id='_sargnSelect']") 
	WebElement preferredLocationDropdown;
	@FindBy(how=How.XPATH, using="//input[@id='LH_LocatedInRadio']") 
	WebElement locatedinRadioInput;
	@FindBy(how=How.XPATH, using="//select[@id='_salicSelect']") 
	WebElement locatedInDropdown;
	@FindBy(how=How.XPATH, using="//input[@id='_fss']") 
	WebElement onlyShowItemsCheckBox;
	@FindBy(how=How.XPATH, using="//input[@id='LH_SpecificSeller_id']") 
	WebElement specificSellersRadioInput;
	@FindBy(how=How.XPATH, using="//select[@id='_saslop']") 
	WebElement sellersInclusionDropdown;
	@FindBy(how=How.XPATH, using="//input[@id='_sasl']") 
	WebElement sellersIdInput;
	@FindBy(how=How.XPATH, using="//input[@id='LH_FavSellers_id']") 
	WebElement mySavedSellersListRadioInput;
	@FindBy(how=How.XPATH, using="//input[@id='LH_SellerWithStore_id']") 
	WebElement sellersWithEbayStoresRadioInput;
	@FindBy(how=How.XPATH, using="//select[@id='LH_SORT_BY']") 
	WebElement sortByDropdown;
	@FindBy(how=How.XPATH, using="//select[@id='LH_VIEW_RESULTS_AS']") 
	WebElement viewResultsDropdown;
	@FindBy(how=How.XPATH, using="//select[@id='LH_IPP']") 
	WebElement resultsPerPageDropdown;
	@FindBy(how=How.XPATH, using="//button[@id='searchBtnLowerLnk']") 
	WebElement bottomSearchButtom;
	@FindBy(how=How.LINK_TEXT, using="Clear options") 
	WebElement clearOptionsLink;
	
	
	

	public void findItemsClick() {
		findItemsLink.click();
	}

	public void onEbayMotorsClick() {
		onEbayMotorsLink.click();
	}
	
	public void bySellerClick() {
		bySellersLink.click();
	}
	
	public void byItemNumberClick() {
		byItemNumberLink.click();
	}
	
	public void itemsInStoreClick() {
		itemsInStoresLink.click();
	}
	
	public void findStoresClick() {
		findStoresLink.click();
	}
	
	public void findItemsByKeywordInputAndClick(String input) 
			throws InterruptedException {
		driver
		.findElement(By.id("//input[@id='_nkw']")).sendKeys(input);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[text()='Search']")).click();
	}
	
	public void searchIncludingTitleDescriptionSelect() {
		driver
		.findElement(
				By.xpath("//input[@id='LH_TitleDesc']")).click();
	}
	
	public void searchIncludingCompletedListingsSelect() {
		driver
		.findElement(
				By.xpath("//input[@id='LH_Complete']")).click();
	}
	
	public void searchIncludingSoldListingsSelect() {
		driver
		.findElement(
				By.xpath("//input[@id='LH_Sold']")).click();
	}
	
	public void showItemsPricedFromCheckBoxSelect() {
		driver.findElement(By.xpath("//*[@id=\'_mPrRngCbx\']")).click();
	}
	
	public void showItemsPricedFromRangeInput(String lo, String hi) throws InterruptedException {
		driver.findElement(By.cssSelector("input[name='_udlo']")).sendKeys(lo);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='_udhi']")).sendKeys(hi);
	}
	
	public void buyingFormatsAuctionSelect() {
		driver.findElement(By.xpath("//input[@id='LH_Auction']")).click();
	}
	
	public void buyingFormatsBuytNowSelect() {
		driver.findElement(By.xpath("//input[@id='LH_BIN']")).click();
	}
	
	public void buyingFormatsClassifiedAdsSelect() {
		driver.findElement(By.xpath("//input[@id='LH_CAds']")).click();
	}
	
	public void conditionNewSelect() {
		driver.findElement(By.xpath("//input[@id='LH_ItemConditionNew']"))
		.click();
		
	}
	
	public void conditionUsedSelect() {
		driver.findElement(By.xpath("//input[@id='LH_ItemConditionNew']"))
		.click();
		
	}
	
	public void conditionNotSpecified() {
		driver.findElement(By.xpath("//input[@id='LH_ItemConditionNS']"))
		.click();
		
	}
	
	public void showResultsListingsSelect() {
		driver.findElement(By.xpath("//input[@id='LH_Time']"))
		.click();
		
	}
	
	public void showResultsListingsEndingWithin() {
		driver.findElement(
				By.xpath("//option[contains(text(),'Ending within')]"))
		.click();
		
	}
	
	public void showResultsListingsEndingInMoreThan() {
		driver.findElement(
				By.xpath("//option[contains(text(),'Ending in more than')]"))
		.click();
		
	}
	
	public void showResultsListingsStartedWithin() {
		driver.findElement(
				By.xpath("//option[contains(text(),'Started within')]"))
		.click();
		
	}
	
	public void showResultsNumOfBidsSelect() {
		driver.findElement(By.xpath("//input[@id='LH_NOB']"))
		.click();
		
	}
	
	public void showResultsMultipleItemsListingsSelect() {
		driver.findElement(By.xpath("//input[@id='LH_MIL']"))
		.click();
		
	}
	
	
	
	public void showResultsItemsListedAsLotsSelect() {
		driver.findElement(By.xpath("//input[@id='LH_Lots']"))
		.click();
		
	}
	
	public void showResultsSaleItemsSelect() {
		driver.findElement(By.xpath("//input[@id='LH_BO']"))
		.click();
		
	}
	
	public void showResultsBestOfferSelect() {
		driver.findElement(By.xpath("//input[@id='LH_BO']"))
		.click();
		
	}
	
	public void showResultsEbayForCharitySelect() {
		driver.findElement(By.xpath("//input[@id='LH_Charity']"))
		.click();
	}
	
	public void shippingOptionsFreeShippingSelect() {
		driver.findElement(By.xpath("//input[@id='LH_FS']")).click();
	}
	
	public void shippingOptionsLocalPickupSelect() {
		driver.findElement(By.xpath("//input[@id='LH_LPickup']")).click();
	}
	
	public void locationLocatedSelect() {
		driver.findElement(By.id("LH_Located")).click();
	}
	
	public void locatedMilesDropdownSelect(int index) {
		WebElement we = driver.findElement(By.xpath("//select[@id='_sadis']"));
		Select select = new Select(we);
		select.selectByIndex(index);
	} //Is this correct approach?
	
	public void locationFromPreferredLocationsSelect() {
		driver.findElement(By.id("LH_PrefLocRadio")).click();
	}
	
	public void FromPreferredLocationsDropdownSelect(int index) {
		WebElement we = driver.findElement(By.xpath("//select[@id='_sadis']"));
		Select select = new Select(we);
		select.selectByIndex(index);
	}
	
	public void locationLocatedInSelect() {
		driver.findElement(By.id("LH_LocatedInRadio")).click();
	}
	
	public void LocatedInOptionsSelect() {
		driver.findElement(By.xpath("//select[@id='_salicSelect']")).click();
	}// Or should I get select web element and pick options in test class?
	
	public void sellersOnlyShowItemsFromSelect() {
		driver.findElement(By.xpath("//input[@id='_fss']")).click();
	}
	
	public void sellersSpecificSellersSelect() {
		driver.findElement(By.xpath("//input[@id='LH_SpecificSeller_id']"))
		.click();
	}
	
	public void specificSellersDropdownSelect() {
		driver.findElement(By.xpath("//select[@id='_saslop']")).click();
	}
	
	public void specificSellersInput(String input) {
		driver.findElement(By.xpath("//input[@id='_sasl']")).sendKeys(input);
	}
	
	public void sellersMySavedSellersListSelect() {
		driver.findElement(By.xpath("//input[@id='LH_FavSellers_id']")).click();
	}
	
	public void sellersWithEbayStoresSelect() {
		driver.findElement(By.xpath("//input[@id='LH_SellerWithStore_id']"))
		.click();
	}
	
	public void sortByDropdown() {
		driver.findElement(By.xpath("//select[@id='LH_SORT_BY']"));
	}
	
	public void viewResultsDropdwn() {
		driver.findElement(By.xpath("//select[@id='LH_VIEW_RESULTS_AS']"));
	}
	
	public void resultsPerPage() {
		driver.findElement(By.xpath("//select[@id='LH_IPP']"));
	}
}
