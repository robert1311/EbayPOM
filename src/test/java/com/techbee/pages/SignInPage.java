package com.techbee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

	WebDriver driver;
	
	@FindBy(how=How.XPATH, using = "//span[@id='signin-reg-msg']")
	WebElement signInMessage;
	@FindBy(how = How.XPATH, using = "//a[@id='gh-la']")
	WebElement ebayLogoButton;
	@FindBy(how=How.XPATH, using="//input[@id='userid']") 
	WebElement signInUsernameInput;
	@FindBy(how=How.XPATH, using="//button[@id='signin-continue-btn']") 
	WebElement continueToPasswordButton;
	@FindBy(how=How.XPATH, using="//input[@id='pass']") 
	WebElement signInPasswordInput;
	@FindBy(how=How.XPATH, using="//button[@id='sgnBt']") 
	WebElement signInButton;
	@FindBy(how=How.XPATH, using="//span[@id='user-info']")
	WebElement welcomeUsername;
	@FindBy(how=How.XPATH, using="//button[@id='signin_ggl_btn']")
	WebElement googleSignInButton;
	@FindBy(how=How.XPATH, using="//button[@id='signin_fb_btn']")
	WebElement facebookSignInButton;
	@FindBy(how=How.XPATH, using="//button[@id='signin_appl_btn']")
	WebElement appleSignInButton;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public String signInMessageText() {
		return signInMessage.getText();
	}
	
	public void ebayLogoClick() {
		ebayLogoButton.click();
	}
	
	public void createAnAccount() {
		
	}
	
	/*
	 * public String enterUsernameInput(String username) { return username;
	 * 
	 * }
	 */
	
	public void continueWithFacebookClick() {
		facebookSignInButton.click();
	}
	
	public void continuewithGoogleClick() {
		googleSignInButton.click();
	}
	
	public void continueWithAppleClick() {
		appleSignInButton.click();
	}
	
	public String signInEnterUsername(String setUsername) {
		signInUsernameInput.sendKeys(setUsername);
		return setUsername;
	}
	
	public void continueToPasswordButtonClick() {
		continueToPasswordButton.click();
	}
	
	public String usernameEntered() {
		return welcomeUsername.getText();
	}
	
	public void signInEnterPassword(String setPassword) {
		signInPasswordInput.sendKeys(setPassword);
	}
	
	public void signInButtonClick() {
		signInButton.click();
	}
	
}
