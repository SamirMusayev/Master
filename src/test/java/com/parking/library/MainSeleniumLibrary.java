package com.parking.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSeleniumLibrary {

	private WebDriver drivera;

	public MainSeleniumLibrary(WebDriver driverl) {
		// TODO Auto-generated constructor stub
		drivera = driverl;
	}

	public WebDriver startChromeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/browser_drivers/chromedriver.exe");
			drivera = new ChromeDriver();
			drivera.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			drivera.manage().window().maximize();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return drivera;

	}

	public void enterboxfield(String searchName, By by) {

		try {
			WebElement boxfield = drivera.findElement(by);
			boxfield.click();
			boxfield.sendKeys(searchName);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
}
