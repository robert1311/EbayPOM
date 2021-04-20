package com.techbee.base;

import org.openqa.selenium.By;

public class Footer extends TestBase {

	public void aboutEbayClick() {
		TestBase.driver.findElement(By.linkText("About eBay")).click();
	}

	public void announcementsClick() {
		TestBase.driver.findElement(By.linkText("Announcements")).click();
	}

	public void CommunityClick() {
		TestBase.driver.findElement(By.linkText("Community")).click();
	}

	public void securityCenterClick() {
		TestBase.driver.findElement(By.linkText("Security Center")).click();
	}

	public void resolutionCenterClick() {
		TestBase.driver.findElement(By.linkText("ResolutionCenter")).click();
	}

	public void sellerCenterClick() {
		TestBase.driver.findElement(By.linkText("Seller Center")).click();
	}

	public void policiesClick() {
		TestBase.driver.findElement(By.linkText("Policies")).click();
	}

	public void affiliatesClick() {
		TestBase.driver.findElement(By.linkText("Affiliates")).click();
	}

	public void helpAndContactClick() {
		TestBase.driver.findElement(By.linkText("Help & Contact")).click();
	}

	public void siteMapClick() {
		TestBase.driver.findElement(By.linkText("Site Map")).click();
	}

}
