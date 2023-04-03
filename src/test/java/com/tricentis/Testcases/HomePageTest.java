package com.tricentis.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tricentis.automobiles.pages.HomePagePOM;
import com.tricentis.base.Base;

public class HomePageTest extends Base {

	public static String actualTitle = "Tricentis Vehicle Insurance";
	public static String actualAutomobile = "Automobile";
	public static String exptTruck = "Truck";
	public static String exptCamper = "Camper";

	HomePagePOM homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		browserLaunch();

		homepage = new HomePagePOM();
	}

	@Test
	public void validateHomePageTitle() {
		String expectedTitle = homepage.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test
	public void validateHomepageLnks() {
		String expectedAutomobileTxt = homepage.validateAutomobileText();
		Assert.assertEquals(actualAutomobile, expectedAutomobileTxt);

		/*
		 * String expectedMotorcycle = homepage.validateMotorCycleText();
		 * Assert.assertEquals(actualAutomobile, expectedMotorcycle);
		 */
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
