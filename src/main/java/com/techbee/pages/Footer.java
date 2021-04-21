package com.techbee.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {
	
	WebDriver driver; 
	
	public Footer(WebDriver driver) {
		this.driver = driver;
	}
	
	public void aboutEbayClick() {
		driver.findElement(By.linkText("About eBay")).click();
	}

	public void announcementsClick() {
		driver.findElement(By.linkText("Announcements")).click();
	}

	public void CommunityClick() {
		driver.findElement(By.linkText("Community")).click();
	}

	public void securityCenterClick() {
		driver.findElement(By.linkText("Security Center")).click();
	}

	public void resolutionCenterClick() {
		driver.findElement(By.linkText("ResolutionCenter")).click();
	}

	public void sellerCenterClick() {
		driver.findElement(By.linkText("Seller Center")).click();
	}

	public void policiesClick() {
		driver.findElement(By.linkText("Policies")).click();
	}

	public void affiliatesClick() {
		driver.findElement(By.linkText("Affiliates")).click();
	}

	public void helpAndContactClick() {
		driver.findElement(By.linkText("Help & Contact")).click();
	}

	public void siteMapClick() {
		driver.findElement(By.linkText("Site Map")).click();
	}

}
