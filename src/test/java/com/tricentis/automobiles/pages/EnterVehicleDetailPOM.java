package com.tricentis.automobiles.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.automobiles.objectrepository.ObjectRepository;
import com.tricentis.base.Base;

public class EnterVehicleDetailPOM extends Base {
	
	@FindBy(xpath =ObjectRepository.automobileLnk )
	@CacheLookup
	WebElement automobileLnk;

	@FindBy(xpath =ObjectRepository.truckLnk)
	@CacheLookup
	WebElement truckLnk;

	@FindBy(xpath =ObjectRepository.motorcycleLnk)
	@CacheLookup
	WebElement motorcycleLnk;

	@FindBy(xpath =ObjectRepository.camperLnk )
	@CacheLookup
	WebElement camperLnk;
	
	@FindBy(xpath =ObjectRepository.selectMake)
	@CacheLookup
	WebElement selectMake;
	
	@FindBy(xpath =ObjectRepository.enginePerfmnceTxt)
	@CacheLookup
	WebElement enginePerfmnceTxt;
	
	@FindBy(xpath =ObjectRepository.manufactureTxt)
	@CacheLookup
	WebElement manufactureTxt;
	
	@FindBy(xpath =ObjectRepository.selectNumSeat)
	@CacheLookup
	WebElement selectNumSeat;
	
	@FindBy(xpath =ObjectRepository.selectFuel)
	@CacheLookup
	WebElement selectFuel;
	
	@FindBy(xpath =ObjectRepository.priceTxt)
	@CacheLookup
	WebElement priceTxt;
	
	@FindBy(xpath =ObjectRepository.licenseTxt)
	@CacheLookup
	WebElement licenseTxt;
	
	@FindBy(xpath =ObjectRepository.mileageTxt)
	@CacheLookup
	WebElement mileageTxt;
	
	@FindBy(xpath =ObjectRepository.vehcileNxtBtn)
	@CacheLookup
	WebElement vehcileNxtBtn;
	
	/*
	public EnterVehicleDetailPOM() {
		PageFactory.initElements(driver, this);
	}
	*/
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public String validateAutomobileText() {
		return automobileLnk.getText();
	}
	
	public String validateTruckText() {
		return truckLnk.getText();
	}
	
	public String validateMotorCycleText() {
		return motorcycleLnk.getText();
	}
		
	public String validateCamperText() {
		return camperLnk.getText();
	}
	
	public AutomobilePage clickOnAutomobile() {
		automobileLnk.click();
		return new AutomobilePage();
	}
	
	public void selectMake(String vMake) {
		Select make = new Select(selectMake);
		make.selectByVisibleText(vMake);
	}
	
	public void enginePerformance(String engine) {
		 enginePerfmnceTxt.sendKeys(engine);
	}
	
	public void manufactureDate(String dmof) {
		manufactureTxt.sendKeys(dmof);
	}
	
	public void selectSeat(String numSeat) {
		Select seat = new Select(selectNumSeat);
		seat.selectByVisibleText(numSeat);
	}
	
	public void selectFuel(String fuelType) {
		Select fuel = new Select(selectFuel);
		fuel.selectByVisibleText(fuelType);
				
	}

	public void listPrice(String priceValue) {
		priceTxt.sendKeys(priceValue);
	}
	
	public void licensePlate(String licenseValue) {
		licenseTxt.sendKeys(licenseValue);
	}
	
	public void anualMileage(String mileageValue) {
		mileageTxt.sendKeys(mileageValue);
	}
	
	public void clickNext() {
		vehcileNxtBtn.click();
		
	}

}
