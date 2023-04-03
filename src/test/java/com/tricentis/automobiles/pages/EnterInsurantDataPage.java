package com.tricentis.automobiles.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.base.Base;
import com.tricentis.utils.Xls_Reader;

public class EnterInsurantDataPage extends Base {

	public static Xls_Reader excel = null;

	public static String expectedTitel = "Tricentis Vehicle Insurance";
	public static String autoMobile = "Automobile";
	public static String exptTruck = "Truck";
	public static String exptCamper = "Camper";

	@Test
	public static void EnterInsurance() throws InterruptedException {

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

		String actualTruck = driver.findElement(By.xpath(prop.getProperty("n"))).getText();

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

		// enter first name
		WebElement firstName = driver.findElement(By.xpath(prop.getProperty("fnameTxt")));
		Assert.assertTrue(firstName.isDisplayed());
		firstName.sendKeys("Rahul");

		// enter last name
		WebElement lastName = driver.findElement(By.xpath(prop.getProperty("lnameTxt")));
		Assert.assertTrue(lastName.isDisplayed());
		lastName.sendKeys("Kumar");

		// enter date of birth
		WebElement birthDate = driver.findElement(By.xpath(prop.getProperty("dobTxt")));
		Assert.assertTrue(birthDate.isDisplayed());
		birthDate.sendKeys("08/23/1992");

		Thread.sleep(2000);
		// select gender
		WebElement radioButton = driver
				.findElement(By.xpath(prop.getProperty("selectGender")));
		Assert.assertTrue(radioButton.isDisplayed());
		radioButton.click();

		// enter street address
		WebElement streetAddress = driver.findElement(By.xpath(prop.getProperty("stAddressTxt")));
		Assert.assertTrue(streetAddress.isDisplayed());
		streetAddress.sendKeys("7th street acacia lane");

		// Select country
		WebElement countryList = driver.findElement(By.xpath(prop.getProperty("selectCountry")));
		Assert.assertTrue(countryList.isDisplayed());
		Select selectCountry = new Select(countryList);
		selectCountry.selectByValue("India");

		// enter Zipcode
		WebElement zipCode = driver.findElement(By.xpath(prop.getProperty("zipcodeTxt")));
		Assert.assertTrue(zipCode.isDisplayed());
		zipCode.sendKeys("110001");

		// enter city name
		WebElement cityName = driver.findElement(By.xpath(prop.getProperty("cityNameTxt")));
		Assert.assertTrue(cityName.isDisplayed());
		cityName.sendKeys("Uttar Pradesh");

		// select occupation
		WebElement occupation = driver.findElement(By.xpath(prop.getProperty("selectOccupation")));
		Assert.assertTrue(occupation.isDisplayed());
		Select selectOccupation = new Select(occupation);
		selectOccupation.selectByVisibleText("Employee");

		// Select hobbies
		WebDriverWait wait = new WebDriverWait(driver, 5000);

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath(prop.getProperty("selectHobby")))).click().perform();

		// Please enter website
		WebElement webSite = driver.findElement(By.xpath(prop.getProperty("websiteTxt")));
		Assert.assertTrue(webSite.isDisplayed());
		webSite.sendKeys("rahulautomobile@gmail.com");

		// click on next button
		WebElement nextButton = driver.findElement(By.xpath(prop.getProperty("insurantNxtBtn")));
		Assert.assertTrue(nextButton.isEnabled());
		nextButton.click();

	}

}	
