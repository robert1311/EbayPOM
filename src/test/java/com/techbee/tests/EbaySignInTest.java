package com.techbee.tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.techbee.pages.HomePage;

public class EbaySignInTest extends TestBase{

	@Test
	public void init() {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
	}
}
