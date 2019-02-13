package com.parking.library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class StartUpLibrary {
	
	public static WebDriver driverl;
	public static MainSeleniumLibrary myLibrary;
	
	
	@BeforeClass
	
	public void beforeALLtST() {
		myLibrary = new MainSeleniumLibrary(driverl);
	}
	
	
	
	
	@BeforeMethod
	public void accept() {
		
		driverl=myLibrary.startChromeBrowser();
		
		
		
	}
	@AfterMethod
	public void afterAllTest() {
		
		driverl.close();
		driverl.quit();
	}
	
	
	
}
