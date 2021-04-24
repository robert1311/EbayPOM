package com.techbee.tests;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.techbee.pages.HomePage;
import com.techbee.pages.SignInPage;

public class EbaySignInAndRegisterTest extends TestBase {

	HomePage hp;
	SignInPage sip;
	WebDriverWait wait=new WebDriverWait(driver, 5);
	
	@Before
	public void setUp() {//initializing page objects
		hp = PageFactory.initElements(driver, HomePage.class);
		sip = PageFactory.initElements(driver, SignInPage.class);
	}
	
	@After
	public void finish() throws InterruptedException {
		sip.ebayLogoClick();//returns to homepage 
	}
	
	/*
	 * Tests sign in method up until re-captcha page after password is submitted
	 * (Note you must manually verify yourself in another window before running
	 * tests)to avoid interruption during tests)
	 */
	@Test
	public void signIn() throws InterruptedException {

		hp.signInClick();
		Thread.sleep(2000);

		//verify if on sign in page
		String message = sip.signInMessageText();
		System.out.println(message);
		assertEquals("Sign in to eBay or create an account", message);
		
		//verify username banner matches entered input
		String username = sip.signInEnterUsername("robert99");
		sip.continueToPasswordButtonClick();
		assertEquals(username, sip.usernameEntered());
		
		//enter invalid password to get to the re-captcha page and verify if on that page 
		sip.signInEnterPassword("invalidPW123");
		sip.signInButtonClick();
		Thread.sleep(3000);
		String errorMessage = driver.getTitle();
		System.out.println(errorMessage);
		assertEquals("Security Measure", errorMessage);
		
		Thread.sleep(3000);
		
	}
	
	
	@Test
	public void signInWithExternalAccountsTest() throws InterruptedException {
		
		//continue with Facebook Account
		hp.signInClick();
		sip.continueWithFacebookClick();
		String verifyFBTitle = driver.getTitle();
		assertEquals("Log into Facebook | Facebook", verifyFBTitle);
		
		driver.navigate().back();
		
		//continue with Google Account
		sip.continuewithGoogleClick();
		Thread.sleep(2000);
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window

		// Now you are in the popup window, perform necessary actions here
		// Verifying pop up window's title
		String verifyGoogleTitle = driver.getTitle();
		assertEquals("Sign in - Google Accounts", verifyGoogleTitle);
		
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		// Continue with Apple ID
		sip.continueWithAppleClick();
		String appleIDPartialURL = "https://appleid.apple.com/auth/authorize?response_type=code%20id_token&scope=name+email&response_mode=form_post&redirect_uri=https%3A%2F%2Fwww.ebay.com";
		String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains(appleIDPartialURL));
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test
	public void registerTest() throws InterruptedException {
		
		// Verify you land on register page
		hp.registerClick();
		String create = driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]")).getText();
		System.out.println(create);
		Assert.assertEquals("Create an account", create);
		
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asdf234");
		String errorMessage = driver.findElement(By.xpath("//div[@id='Email_err']")).getText();
		assertEquals("Email address is invalid. Please enter a valid email address.", errorMessage);
	}
	
	
}
