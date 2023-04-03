package com.tricentis.automobiles.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tricentis.base.Base;

public class HomePage extends Base {

	public static String expectedTitel = "Tricentis Vehicle Insurance";
	public static String autoMobile = "Automobile";
	public static String exptTruck = "Truck";
	public static String exptCamper = "Camper";

	@Test
	public static void homeDetails() {

		// SoftAssert softAssert = new SoftAssert();
		// Validating title of the page

		String actualtille = driver.getTitle();

		Assert.assertEquals(actualtille, expectedTitel);

		System.out.println("Actual and expected title both are same");

		// Validating Automobile option is present or not.

		String actualAutoMobile = driver
				.findElement(By.xpath(prop.getProperty("automobileLnk"))).getText();

		Assert.assertEquals(actualAutoMobile, autoMobile);

		System.out.println("Automobile option is present");

		// VAlidate Truck option is available or not

		String actualTruck = driver.findElement(By.xpath(prop.getProperty("truckLnk"))).getText();

		Assert.assertEquals(actualTruck, exptTruck);

		System.out.println("Truck option is present");

		// Validate Motorcycle option is present or not

		driver.findElement(By.xpath(prop.getProperty("motorcycleLnk")));

		// Validate Camper option is available or not

		String actualCamper = driver.findElement(By.xpath(prop.getProperty("camperLnk")))
				.getText();

		Assert.assertEquals(actualCamper, exptCamper);
		System.out.println("Camper option is present");

		// Click on the Automobile

		driver.findElement(By.xpath(prop.getProperty("automobileLnk"))).click();

		driver.quit();

	}

}
