package com.techbee.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Header extends Footer {

	public void main(String[] args) {
		
	}
	
	public void signInClick() {
		//click on sign in
		driver.
		findElement(By.
				linkText("Sign in")).click();
	}
	
	public void registerClick() {
		driver.
		findElement(By.
				linkText("Register")).click();
	}
	
	public void dailyDealsClick() {
		driver.findElement(By.linkText("Daily Deals")).click();
	}
	
	public void brandOutletClick() {
		driver.findElement(By.linkText(" Brand Outlet")).click();
	}
	
	public void helpAndContactClick() {
		driver.findElement(By.linkText("Help & Contact")).click();
	}
	
	public void Sell() {
		driver.findElement(By.linkText("Sell")).click();
	}
	
	public void watchListClick() {
		driver.findElement(By.linkText("Watchlist")).click();
	}
	
	public void MyEbayHover() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("gh-eb-My"));
		action.moveToElement(we).perform();
	}
	
	public void MyEbayClick() {
		driver.findElement(By.linkText("My eBay")).click();
	}
	
	public void notificationBellClick() {
		driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]"))
		.click();
	}
	
	
	
	

}
