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
	public static String actualTruck = "Truck";
	public static String actualMotorcycle = "Motorcycle";
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
		//Validating Automobile
		String expectedAutomobileTxt = homepage.validateAutomobileText();
		Assert.assertEquals(actualAutomobile, expectedAutomobileTxt);
		//Validating Truck option on home page
		String expectedTruckTxt = homepage.validateTruckText();
		Assert.assertEquals(actualTruck,expectedTruckTxt );
		//Validating Motorcycle option on home page
		String expectedMotorcycleTxt = homepage.validateMotorCycleText();
		Assert.assertEquals(actualMotorcycle, expectedMotorcycleTxt);
		//Validating Camper option on home page
		String expectedCamperTxt = homepage.validateCamperText();
		Assert.assertEquals(actualMotorcycle, expectedCamperTxt);
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
