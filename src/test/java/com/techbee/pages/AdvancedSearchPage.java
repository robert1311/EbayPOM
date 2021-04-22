package com.techbee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdvancedSearchPage extends Header {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//td[@id='gh-title']")
	WebElement pageTitle;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Find items')]")
	WebElement findItemsLink;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'On eBay Motors')]")
	WebElement onEbayMotorsLink;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'By seller')]")
	WebElement bySellersLink;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'By item number')]")
	WebElement byItemNumberLink;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Items in stores')]")
	WebElement itemsInStoresLink;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Find Stores')]")
	WebElement findStoresLink;
	@FindBy(how = How.XPATH, using = "//input[@id='_nkw']")
	WebElement findItemsByKeywordInput;
	@FindBy(how = How.XPATH, using = "//select[@id='_in_kw']")
	WebElement keywordDropdown;
	@FindBy(how = How.XPATH, using = "//input[@id='_ex_kw']")
	WebElement excludeKeywordInput;
	@FindBy(how = How.XPATH, using = "//select[@id='e1-1']")
	WebElement inThisCategoryDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\'adv_search_from\']/fieldset[1]/div[3]/button")
	WebElement topSearchButton;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_TitleDesc']")
	WebElement titleDesriptionCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_Complete']")
	WebElement completedListingsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_Sold']")
	WebElement SoldListingsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='_mPrRngCbx']")
	WebElement showItemsPricedFromCheckBox;
	@FindBy(how = How.CSS, using = "//input[@name*='_udlo']")
	WebElement loPriceInput;
	@FindBy(how = How.CSS, using = "//input[@name*='_udlhi']")
	WebElement hiPriceInput;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_Auction']")
	WebElement auctionCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_BIN']")
	WebElement BuyItNowCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_CAds']")
	WebElement classifiedAdsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_ItemConditionNew']")
	WebElement newCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_ItemConditionUsed']")
	WebElement usedCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_ItemConditionNS']")
	WebElement NotSpecifiedCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_Time']")
	WebElement listingsCheckBox;
	@FindBy(how = How.XPATH, using = "//select[aria-label*='Listing options']")
	WebElement listingOptinsDropdown;
	@FindBy(how = How.XPATH, using = "//select[aria-label*='Time frame']")
	WebElement listingsTimeFrameDropdown;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_NOB']")
	WebElement numOfBidsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='_sabdlo']")
	WebElement loBidsInput;
	@FindBy(how = How.XPATH, using = "//input[@id='_sabdhi']")
	WebElement hiBidsInput;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_MIL']")
	WebElement multipleItemListingsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='_samilow']")
	WebElement minItemsInput;
	@FindBy(how = How.XPATH, using = "//input[@id='_samihi']")
	WebElement maxItemsInput;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_Lots']")
	WebElement itemsListedAsLotsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_SaleItems']")
	WebElement saleItemsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_BO']")
	WebElement bestOfferCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_Charity']")
	WebElement eBayForCharityCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_FS']")
	WebElement freeShippingCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_LPickup']")
	WebElement localPickUpCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_Located']")
	WebElement locatedRadioInput;
	@FindBy(how = How.XPATH, using = "//select[@id='_sadis']")
	WebElement milesDropdown;
	@FindBy(how = How.XPATH, using = "//input[@id='_stpos']")
	WebElement zipcodeInput;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_PrefLocRadio']")
	WebElement preferredLocationsRadioInput;
	@FindBy(how = How.XPATH, using = "//select[@id='_sargnSelect']")
	WebElement preferredLocationDropdown;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_LocatedInRadio']")
	WebElement locatedInRadioInput;
	@FindBy(how = How.XPATH, using = "//select[@id='_salicSelect']")
	WebElement locatedInOptinsDropdown;
	@FindBy(how = How.XPATH, using = "//input[@id='_fss']")
	WebElement onlyShowItemsCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_SpecificSeller_id']")
	WebElement specificSellersRadioInput;
	@FindBy(how = How.XPATH, using = "//select[@id='_saslop']")
	WebElement sellersInclusionDropdown;
	@FindBy(how = How.XPATH, using = "//input[@id='_sasl']")
	WebElement sellersIdInput;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_FavSellers_id']")
	WebElement mySavedSellersListRadioInput;
	@FindBy(how = How.XPATH, using = "//input[@id='LH_SellerWithStore_id']")
	WebElement sellersWithEbayStoresRadioInput;
	@FindBy(how = How.XPATH, using = "//select[@id='LH_SORT_BY']")
	WebElement sortByDropdown;
	@FindBy(how = How.XPATH, using = "//select[@id='LH_VIEW_RESULTS_AS']")
	WebElement viewResultsDropdown;
	@FindBy(how = How.XPATH, using = "//select[@id='LH_IPP']")
	WebElement resultsPerPageDropdown;
	@FindBy(how = How.XPATH, using = "//button[@id='searchBtnLowerLnk']")
	WebElement bottomSearchButtom;
	@FindBy(how = How.LINK_TEXT, using = "Clear options")
	WebElement clearOptionsLink;

	public AdvancedSearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
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

	public void findItemsByKeyworEnterdInput(String input) {
		findItemsByKeywordInput.sendKeys(input);
		;
	}

	public void topSearchButtonClick() {
		topSearchButton.click();
	}

	public void searchIncludingTitleDescriptionMark() {
		titleDesriptionCheckBox.click();
	}

	public void searchIncludingCompletedListingsMark() {
		completedListingsCheckBox.click();
	}

	public void searchIncludingSoldListingsMark() {
		SoldListingsCheckBox.click();
	}

	public void showItemsPricedFromMark() {
		showItemsPricedFromCheckBox.click();
	}

	public void showItemsPricedFromLoInput(String lo) {
		loPriceInput.sendKeys(lo);
	}

	public void showItemsPricedFromHiInput(String hi) {
		hiPriceInput.sendKeys(hi);
	}

	public void buyingFormatsAuctionMark() {
		auctionCheckBox.click();
	}

	public void buyingFormatsBuyItNowMark() {
		BuyItNowCheckBox.click();
	}

	public void buyingFormatsClassifiedAdsMark() {
		classifiedAdsCheckBox.click();
	}

	public void conditionNewMark() {
		newCheckBox.click();
	}

	public void conditionUsedMark() {
		usedCheckBox.click();

	}

	public void conditionNotSpecifiedMark() {
		NotSpecifiedCheckBox.click();

	}

	public void showResultsListingsMark() {
		listingsCheckBox.click();

	}

	public void showResultsListingsOptionsDropdownSelect() {
		listingOptinsDropdown.click();
		;

	}

	public void showResultsNumOfBidsMark() {
		numOfBidsCheckBox.click();

	}

	public void showResultsMultipleItemsListingsMark() {
		multipleItemListingsCheckBox.click();

	}

	public void showResultsItemsListedAsLotsMark() {
		itemsListedAsLotsCheckBox.click();

	}

	public void showResultsSaleItemsMark() {
		saleItemsCheckBox.click();

	}

	public void showResultsBestOfferMark() {
		bestOfferCheckBox.click();

	}

	public void showResultsEbayForCharityMark() {
		eBayForCharityCheckBox.click();
	}

	public void shippingOptionsFreeShippingMark() {
		freeShippingCheckBox.click();
	}

	public void shippingOptionsLocalPickupMark() {
		localPickUpCheckBox.click();
	}

	public void locationLocatedMark() {
		locatedRadioInput.click();
	}

	public void locatedMilesDropdownSelect() {
		milesDropdown.click();
	} // Is this correct approach?

	public void locatedInZipcodeInput(String zipcode) {
		zipcodeInput.sendKeys(zipcode);
	}

	public void locationFromPreferredLocationsMark() {
		preferredLocationsRadioInput.click();
	}

	public void FromPreferredLocationsDropdownSelect() {
		preferredLocationDropdown.click();
		;
	}

	public void locationLocatedInBubble() {
		locatedInRadioInput.click();
	}

	public void LocatedInOptionsSelect() {
		locatedInOptinsDropdown.click();
	}// Or should I get select web element and pick options in test class?

	public void sellersOnlyShowItemsFromMark() {
		showItemsPricedFromCheckBox.click();
	}

	public void sellersSpecificSellersBubble() {
		specificSellersRadioInput.click();
	}

	public void specificSellersDropdownSelect() {
		sellersInclusionDropdown.click();
	}

	public void specificSellersBubble(String input) {
		specificSellersRadioInput.sendKeys(input);
	}

	public void sellersMySavedSellersListBubble() {
		mySavedSellersListRadioInput.click();
	}

	public void sellersWithEbayStoresBubble() {
		sellersWithEbayStoresRadioInput.click();
	}

	public void sortByDropdownSelect() {
		sortByDropdown.click();
	}

	public void viewResultsDropdwnSelect() {
		viewResultsDropdown.click();
	}

	public void resultsPerPageDropdownSelect() {
		resultsPerPageDropdown.click();
		;
	}
}
