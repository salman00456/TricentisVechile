package com.tricentis.Testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tricentis.automobiles.pages.EnterVehicleDetailPOM;
import com.tricentis.automobiles.pages.HomePagePOM;
import com.tricentis.base.Base;

public class EnterVechileDetailTest extends Base{

	public static String actualTitle = "Tricentis Vehicle Insurance";
	public static String actualAutomobile = "Automobile";
	public static String exptTruck = "Truck";
	public static String exptCamper = "Camper";
	
	//EnterVehicleDetailPOM vehiclePage;
	
	public EnterVechileDetailTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		browserLaunch();

		
	}
	
	@Test
	public void enterVechileDetail() {
		
		HomePagePOM homePage = PageFactory.initElements(driver, HomePagePOM.class);
		homePage.validateTitle();
		homePage.validateAutomobileText();
		homePage.validateTruckText();
		homePage.validateMotorCycleText();
		homePage.validateCamperText();
		homePage.clickOnAutomobile();
		
		EnterVehicleDetailPOM vehicleDetails = PageFactory
				.initElements(driver, EnterVehicleDetailPOM.class);
		vehicleDetails.selectMake("Honda");
		vehicleDetails.enginePerformance("1400");
		vehicleDetails.manufactureDate("08/23/2019");
		vehicleDetails.selectSeat("7");
		vehicleDetails.selectFuel("Petrol");
		vehicleDetails.listPrice("10000");
		vehicleDetails.licensePlate("DL01AB4456");
		vehicleDetails.anualMileage("400");
		vehicleDetails.clickNext();
		
	}
}
