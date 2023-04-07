package com.tricentis.automobiles.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.automobiles.objectrepository.ObjectRepository;
import com.tricentis.base.Base;
import com.tricentis.utilities.Xls_Reader;

public class EnterInsurantDetailsPOM extends Base {
	
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
	
	@FindBy(xpath =ObjectRepository.fnameTxt)
	WebElement fnameTxt;
	
	@FindBy(xpath =ObjectRepository.lnameTxt)
	WebElement lnameTxt;
	
	@FindBy(xpath =ObjectRepository.dobTxt)
	WebElement dobTxt;
	
	@FindBy(xpath =ObjectRepository.selectGender)
	WebElement selectGender;
	
	@FindBy(xpath =ObjectRepository.stAddressTxt)
	WebElement stAddressTxt;
	
	@FindBy(xpath =ObjectRepository.selectCountry)
	WebElement selectCountry;
	
	@FindBy(xpath =ObjectRepository.zipcodeTxt)
	WebElement zipcodeTxt;
	
	@FindBy(xpath =ObjectRepository.cityNameTxt)
	WebElement cityNameTxt;
	
	@FindBy(xpath =ObjectRepository.selectOccupation)
	WebElement selectOccupation;
	
	@FindBy(xpath =ObjectRepository.selectHobby)
	WebElement selectHobby;
	
	@FindBy(xpath =ObjectRepository.websiteTxt)
	WebElement websiteTxt;
	
	@FindBy(xpath =ObjectRepository.insurantNxtBtn)
	WebElement insurantNxtBtn;
	
	public EnterInsurantDetailsPOM() {
		PageFactory.initElements(driver, this);
	}
	
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
	
	public void selectMake() {
		Select make = new Select(selectMake);
		make.selectByVisibleText("");
	}
	
	public void enginePerformance() {
		 enginePerfmnceTxt.sendKeys();
	}
	
	public void manufactureDate() {
		manufactureTxt.sendKeys();
	}
	
	public void selectSeat() {
		Select seat = new Select(selectNumSeat);
		seat.selectByVisibleText("");
	}

	public void listPrice() {
		priceTxt.sendKeys();
	}
	
	public void licensePlate() {
		licenseTxt.sendKeys();
	}
	
	public void anualMileage() {
		mileageTxt.sendKeys();
	}
	
	public void clickNext() {
		vehcileNxtBtn.click();
		
	}
	
	public void enterFirstName(String fname) {
		fnameTxt.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lnameTxt.sendKeys(lname);
	}
	
	public void dateOfBirth(String dob) {
		dobTxt.sendKeys(dob);
	}
	
	public void selectGender() {
		selectGender.click();
	}
	
	public void enterAddress(String addressValue) {
		stAddressTxt.sendKeys(addressValue);
	}
	
	// select country need to be write
	public void selectCountryValue(String countryValue) {
		Select country = new Select(selectCountry);
		country.selectByValue(countryValue);
	}
	
	public void enterZipCode(String zipcodeValue) {
		zipcodeTxt.sendKeys(zipcodeValue);
	}
	
	public void enterCity(String cityValue) {
		cityNameTxt.sendKeys(cityValue);
	}
	
	//occupation need to write
	public void selectOcupation(String ocupationValue) {
		Select ocupation = new Select(selectOccupation);
		ocupation.selectByVisibleText(ocupationValue);
	}
	
	public void hobbies() {
		selectHobby.click();
	}
	
	public void enterWebSite(String websiteValue) {
		websiteTxt.sendKeys(websiteValue);
	}
	
	public void clickNextBtn() {
		insurantNxtBtn.click();
	}



}	
