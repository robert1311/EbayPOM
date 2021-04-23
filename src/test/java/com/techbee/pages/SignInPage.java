package com.techbee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

	WebDriver driver;
	
	@FindBy(how=How.XPATH, using = "//span[@id='signin-reg-msg']")
	WebElement signInMessage;
	@FindBy(how = How.XPATH, using = "//img[@id='gh-logo']")
	WebElement ebayLogo;
	@FindBy(how=How.XPATH, using="//input[@id='userid']") 
	WebElement signInUsernameInput;
	@FindBy(how=How.XPATH, using="//button[@id='signin-continue-btn']") 
	WebElement continueToPasswordButton;
	@FindBy(how=How.XPATH, using="//input[@id='pass']") 
	WebElement signInPasswordInput;
	@FindBy(how=How.XPATH, using="//button[@id='sgnBt']") 
	WebElement signInButton;

	public String signInMessageText() {
		return signInMessage.getText();
	}
	
	public void ebayLogoClick() {
		
	}
	
	public void createAnAccount() {
		
	}
	
	public void enterUsernameInput() {
		
	}
	
	public void continueButtonClick() {
		
	}
	
	public void continueWithFacebookClick() {
		
	}
	
	public void continuewithGoogleClick() {
		
	}
	
	public void continueWithAppleClick() {
		
	}
	
	public void staySignedInClick() {
		
	}
	
	public void learnMoreLinkClick() {
		
	}
	
	public void signInEnterUsername(String setUsername) {
		signInUsernameInput.sendKeys(setUsername);
	}
	
	public void continueToPasswordButtonClick() {
		continueToPasswordButton.click();
	}
	
	public void signInEnterPassword(String setPassword) {
		signInPasswordInput.sendKeys(setPassword);
	}
	
	public void signInButtonClick() {
		signInButton.click();
	}
	
}
