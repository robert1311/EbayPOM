package com.techbee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Footer {
	
	WebDriver driver; 
	
	@FindBy(how=How.LINK_TEXT, 
			using="Saved") WebElement aboutEbayLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Announcements") WebElement announcementsLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Community") WebElement communityLink;
	@FindBy(how=How.LINK_TEXT, 
			using="securityCenter") WebElement securityCenterLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Resolution") WebElement resolutionCenterLink;
	@FindBy(how=How.LINK_TEXT, 
			using="SellerCenter") WebElement sellerCenterLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Policies") WebElement policiesLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Affiliates") WebElement affiliatesLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Help & Contact") WebElement helpAndContactLink;
	@FindBy(how=How.LINK_TEXT, 
			using="Site Map") WebElement siteMapLink;
	
	
	public Footer(WebDriver driver) {
		this.driver = driver;
	}
	
	public void aboutEbayClick() {
		aboutEbayLink.click();
	}

	public void announcementsClick() {
		announcementsLink.click();
	}

	public void CommunityClick() {
		communityLink.click();
	}

	public void securityCenterClick() {
		securityCenterLink.click();
	}

	public void resolutionCenterClick() {
		resolutionCenterLink.click();
	}

	public void sellerCenterClick() {
		sellerCenterLink.click();
	}

	public void policiesClick() {
		policiesLink.click();
	}

	public void affiliatesClick() {
		affiliatesLink.click();
	}

	public void helpAndContactClick() {
		helpAndContactLink.click();
	}

	public void siteMapClick() {
		siteMapLink.click();
	}

}
