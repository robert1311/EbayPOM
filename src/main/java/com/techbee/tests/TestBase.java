 	package com.techbee.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver = null; 
	
	public static void configureDriver(){

		//Initiating driver - Singleton Pattern
		if(driver == null) {
			if(Constants.browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\rober\\Documents\\WebDrivers\\chromedriver_win32-89"
						+ "\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if(Constants.browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\rober\\Documents\\WebDrivers\\chromedriver_win32-89"
						+ "\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if(Constants.browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\rober\\Documents\\WebDrivers\\chromedriver_win32-89"
						+ "\\msedgedriver.exe");
				driver = new EdgeDriver();
			} else if(Constants.browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\rober\\Documents\\WebDrivers\\chromedriver_win32-89"
						+ "\\IEDriver.exe");
				driver = new InternetExplorerDriver();
			}
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(Constants.url);
		
	}
	
	public void quit() {
		System.out.println("Quitting the browser");
		driver.quit();
		driver = null;
	}
	
	public void close() {
		System.out.println("Closing the browser");
		driver.close();
		driver = null;
	}

}
