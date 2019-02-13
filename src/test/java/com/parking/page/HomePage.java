package com.parking.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.parking.library.StartUpLibrary;

import net.bytebuddy.asm.AsmVisitorWrapper;

public class HomePage extends StartUpLibrary {

	public HomePage go_to_website() {
		driverl.get("http://adam.goucher.ca/parkcalc/");
		String PageTitle = driverl.getTitle();
		System.out.println("Website title is " + PageTitle);
//		assertEquals(PageTitle, "Online Courses & Lectures for Home Study and Lifelong Learning");
		return this;
	}

	

	public HomePage entryTimeField(String date, By by) {
		WebElement entryTimeBox = driverl.findElement(by);
		entryTimeBox.click();
		entryTimeBox.clear();
		entryTimeBox.sendKeys(date);

		return this;
	}

	public HomePage exitTimeField(String date, By by) {
		WebElement exitTimeBox = driverl.findElement(by);
		exitTimeBox.click();
		exitTimeBox.clear();
		exitTimeBox.sendKeys(date);

		return this;

	}

	public HomePage entryMonthDate (String date, By by) {
		WebElement entryMonthBox = driverl.findElement(by);
		entryMonthBox.click();
		entryMonthBox.clear();
		entryMonthBox.sendKeys(date);
		
		return this;
	}
	
	public HomePage exitMonthDate (String date, By by) {
		WebElement exitMonthBox = driverl.findElement(by);
		exitMonthBox.click();
		exitMonthBox.clear();
		exitMonthBox.sendKeys(date);
		
		return this;
	}
	
	public HomePage calculateBtn(By by) {
		WebElement btnCalc = driverl.findElement(by);
		btnCalc.click();
		
		
		
		return this;
	}
	public HomePage verification(String expectedAmount) {
		WebElement amountGotten = driverl.findElement(By.className("SubHead"));
		String thenumber = amountGotten.toString();
		assertEquals(expectedAmount, thenumber);
		System.out.println("Expected amount is " + thenumber);
		return this;
		
	}
	
}
