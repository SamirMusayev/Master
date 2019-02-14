package com.parking.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.parking.library.StartUpLibrary;
import com.parking.page.HomePage;

public class ParkCalculate extends StartUpLibrary {
	HomePage page1 = new HomePage();

	@Test
	public void runningtheCalculation() {
		try {
			page1.go_to_website();
			page1.entryTimeField("14:55", By.id("EntryTime"));
			page1.entryMonthDate("6/11/2019", By.id("EntryDate"));
			page1.exitTimeField("12:38", By.id("ExitTime"));
			page1.exitMonthDate("3/12/2020", By.id("ExitDate"));
			page1.calculateBtn(By.name("Submit"));
			page1.verification("500.35");
 System.out.println("esq olsun");
 System.out.println("esq olsun2");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
