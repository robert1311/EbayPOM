package com.techbee.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage extends Header{

	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void savedClick() {
		driver.
		findElement(
				By.linkText("Saved")).click();
	}
	
	public void motorsClick() {
		driver.
			findElement(
					By.linkText("Motors")).click();
	}
	
	public void motorsExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Motors"));
		action.moveToElement(we).perform();
		
	}
	
	public void fashionClick() {
		driver.
		findElement(
				By.linkText("Fashion")).click();
	}
	
	public void fashionExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Fashion"));
		action.moveToElement(we).perform();
		
	}
	
	public void electronicsClick() {
		driver.
		findElement(
				By.linkText("Electronics")).click();
	}
	
	public void electronicsExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Electronics"));
		action.moveToElement(we).perform();
		
	}
	
	public void collectiblesAndArtClick() {
		driver.
		findElement(
				By.linkText("Collectibles & Art")).click();
	}
	
	public void collectiblesAndArtExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Collectibles & Art"));
		action.moveToElement(we).perform();
		
	}
	
	public void homeAndGardenClick() {
		driver.
		findElement(
				By.linkText("Home & Garden")).click();
	}
	
	public void homeAndGardenExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Home & Garden"));
		action.moveToElement(we).perform();
		
	} 
	
	public void sportingGoodsClick() {
		driver.
		findElement(
				By.linkText("Sporting Goods")).click();
	}
	
	public void sportingGoodsExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Sporting Goods"));
		action.moveToElement(we).perform();
		
	} 
	
	public void toysClick() {
		driver.
		findElement(
				By.linkText("Toys")).click();
	}
	
	public void toysExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Toys"));
		action.moveToElement(we).perform();
		
	} 
	
	public void businessAndIndustrialClick() {
		driver.
		findElement(
				By.linkText("Business & Industrial")).click();
	}
	
	public void businessAndIndustrialExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Business & Industrial"));
		action.moveToElement(we).perform();
		
	} 
	
	public void musicClick() {
		driver.
		findElement(
				By.linkText("Music")).click();
	}
	
	public void musicExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Music"));
		action.moveToElement(we).perform();
		
	} 
	
	public void dealsClick() {
		driver.
		findElement(
				By.linkText("Deals")).click();
	}
	
	public void dealsExpand() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("Deals"));
		action.moveToElement(we).perform();
		
	} 
	
	public void todaysDealsClick() {
		driver.findElement(
				By.xpath("//*[@id=\'items_list1\']/div[1]/div/div[1]/h2/a"))
		.click();
	}
	
	
	
	public void searchByCategoryExpandAndClick(String regex) 
			throws InterruptedException {
		
		driver.findElement(By.xpath("//select[@id='gh-cat']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(regex)).click();
	}
	
	public void enterUsernameAndSignInClick(String input) {
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys(input);
		driver.findElement(By.xpath("//button[@id='signin-continue-btn']"))
		.click();
	}
	
	public void advancedSearchClick() {
		driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
	}
	
}
