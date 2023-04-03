package com.tricentis.automobiles.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.base.Base;

public class EnterVehicleDataPage extends Base {
	
	public static String expectedTitel = "Tricentis Vehicle Insurance";

	public static String autoMobile = "Automobile";
	public static String exptTruck = "Truck";
	public static String exptCamper = "Camper";

	@Test
	public static void enterVehicleDetail() {

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

		driver.findElement(By.xpath("//a[contains(text(),'Motorcycle')]"));

		// Validate Camper option is available or not

		String actualCamper = driver
				.findElement(By.xpath(prop.getProperty("camperLnk")))
				.getText();

		Assert.assertEquals(actualCamper, exptCamper);
		System.out.println("Camper option is present");

		// Click on the Automobile

		driver.findElement(By.xpath(prop.getProperty("automobileLnk"))).click();

		// Select the vehicle make/company

		WebElement vechicleMake = driver
				.findElement(By.xpath(prop.getProperty("selectMake")));

		Select select = new Select(vechicleMake);

		Assert.assertTrue(vechicleMake.isDisplayed());
		select.selectByVisibleText("Honda");

		// Enter engine performance

		WebElement enginePerformance = driver
				.findElement(By.xpath(prop.getProperty("enginePerfmnceTxt")));

		Assert.assertTrue(enginePerformance.isDisplayed());
		enginePerformance.sendKeys("1400");

		//Enter manufacture date
		WebElement manufactureDate = driver
				.findElement(By.xpath(prop.getProperty("manufactureTxt")));

		Assert.assertTrue(manufactureDate.isDisplayed());

		manufactureDate.sendKeys("08/23/2019");

		// select no of seats

		WebElement seatNum = driver
				.findElement(By.xpath(prop.getProperty("selectNumSeat")));
		Assert.assertTrue(seatNum.isDisplayed());

		Select selectSeat = new Select(seatNum);

		selectSeat.selectByVisibleText("7");

		// Select fuel type

		WebElement fuelType = driver
				.findElement(By.xpath(prop.getProperty("selectFuel")));

		Assert.assertTrue(fuelType.isDisplayed());

		Select selectFuel = new Select(fuelType);
		selectFuel.selectByVisibleText("Petrol");

		// enter the list price of vehicle
		WebElement price = driver
				.findElement(By.xpath(prop.getProperty("priceTxt")));
		Assert.assertTrue(price.isDisplayed());
		price.sendKeys("10000");

		// Enter license plate number
		WebElement plateNum = driver
				.findElement(By.xpath(prop.getProperty("licenseTxt")));

		Assert.assertTrue(plateNum.isDisplayed());
		plateNum.sendKeys("DL01AB4456");

		// Enter annual mileage
		WebElement mileage = driver
				.findElement(By.xpath(prop.getProperty("mileageTxt")));
		Assert.assertTrue(mileage.isDisplayed());
		mileage.sendKeys("400");
		
		//click on the next button
		WebElement button = driver
				.findElement(By.xpath(prop.getProperty("vehcileNxtBtn")));
		Assert.assertTrue(button.isDisplayed());
		button.click();
		
		driver.quit();

	}

}
