package com.techbee.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techbee.pages.Header;
import com.techbee.pages.HomePage;
import com.techbee.pages.SignInPage;

public class EbaySignInTest extends TestBase {

	HomePage hp;
	//WebDriverWait wait=new WebDriverWait(driver, 5);
	
	@Before
	public void setUp() {
		hp = PageFactory.initElements(driver, HomePage.class);
	}
	
	@After
	public void finish() throws InterruptedException {
		
		
	}
	
	@Test
	public void signIn() throws InterruptedException {
		//HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.signInClick();
		Thread.sleep(2000);

		 SignInPage sip = PageFactory.initElements(driver, SignInPage.class);
		
			/*
			 * String verifyMessage =
			 * driver.findElement(By.xpath("//*[@id=\"areaTitle\"]/h1")).getText();
			 * System.out.println(verifyMessage);
			 * Assert.assertEquals("Please verify yourself to continue", verifyMessage);
			 */
		String message = sip.signInMessageText();
		System.out.println(message);
		Assert.assertEquals("Sign in to eBay or create an account", message);
	}

	@Test
	public void registerTest() {
		//HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.registerClick();
		String create = driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]")).getText();
		System.out.println(create);
		Assert.assertEquals("Create an account", create);
	}
	
	@Test
	public void searchItemTest() {
		
	}
}
