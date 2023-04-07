package com.tricentis.automobiles.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
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

public class EnterProductIDetailPagePOM extends Base {

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
	@CacheLookup
	WebElement fnameTxt;
	
	@FindBy(xpath =ObjectRepository.lnameTxt)
	@CacheLookup
	WebElement lnameTxt;
	
	@FindBy(xpath =ObjectRepository.dobTxt)
	@CacheLookup
	WebElement dobTxt;
	
	@FindBy(xpath =ObjectRepository.selectGender)
	@CacheLookup
	WebElement selectGender;
	
	@FindBy(xpath =ObjectRepository.stAddressTxt)
	@CacheLookup
	WebElement stAddressTxt;
	
	@FindBy(xpath =ObjectRepository.selectCountry)
	@CacheLookup
	WebElement selectCountry;
	
	@FindBy(xpath =ObjectRepository.zipcodeTxt)
	@CacheLookup
	WebElement zipcodeTxt;
	
	@FindBy(xpath =ObjectRepository.cityNameTxt)
	@CacheLookup
	WebElement cityNameTxt;
	
	@FindBy(xpath =ObjectRepository.selectOccupation)
	@CacheLookup
	WebElement selectOccupation;
	
	@FindBy(xpath =ObjectRepository.selectHobby)
	@CacheLookup
	WebElement selectHobby;
	
	@FindBy(xpath =ObjectRepository.websiteTxt)
	@CacheLookup
	WebElement websiteTxt;
	
	@FindBy(xpath =ObjectRepository.insurantNxtBtn)
	@CacheLookup
	WebElement insurantNxtBtn;
	
	@FindBy(xpath =ObjectRepository.startDateTxt )
	@CacheLookup
	WebElement startDateTxt;
	
	@FindBy(xpath =ObjectRepository.selectInsuranceSum )
	@CacheLookup
	WebElement selectInsuranceSum;
	
	@FindBy(xpath =ObjectRepository.selectMerit )
	@CacheLookup
	WebElement selectMerit;
	
	@FindBy(xpath =ObjectRepository.selectDamageIns )
	@CacheLookup
	WebElement selectDamageIns;
	
	@FindBy(xpath =ObjectRepository.optionalPrdctTxt )
	@CacheLookup
	WebElement optionalPrdctTxt;
	
	@FindBy(xpath =ObjectRepository.selectCourtsey )
	@CacheLookup
	WebElement selectCourtsey;
	
	@FindBy(xpath =ObjectRepository.priceNxtBtn)
	@CacheLookup
	WebElement priceNxtBtn;
	
	public EnterProductIDetailPagePOM() {
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
	
	public void enterFirstName() {
		fnameTxt.sendKeys();
	}
	
	public void enterLastName() {
		lnameTxt.sendKeys();
	}
	
	public void dateOfBirth() {
		dobTxt.sendKeys();
	}
	
	public void selectGender() {
		selectGender.click();
	}
	
	public void enterAddress() {
		stAddressTxt.sendKeys();
	}
	
	// select country need to be write
	public void selectCountryValue(String countryValue) {
		Select country = new Select(selectCountry);
		country.selectByValue(countryValue);
	}
	
	public void enterZipCode() {
		zipcodeTxt.sendKeys();
	}
	
	public void enterCity() {
		cityNameTxt.sendKeys();
	}
	
	//occupation need to write
	public void selectOcupation(String ocupationValue) {
		Select ocupation = new Select(selectOccupation);
		ocupation.selectByVisibleText(ocupationValue);
	}
	
	public void hobbies() {
		selectHobby.click();
	}
	
	public void enterWebSite() {
		websiteTxt.sendKeys();
	}
	
	public void clickNextBtn() {
		insurantNxtBtn.click();
	}
	
	public void enterStartDate(String sdate) {
		startDateTxt.sendKeys(sdate);
	}
	
	public void selectInsurance(String insuranveValue) {
	Select selectSum = new Select(selectInsuranceSum);
	selectSum.selectByValue(insuranveValue);
	}
	
	public void selectMerit(String meritValue) {
		Select merit = new Select(selectMerit);
		merit.selectByValue(meritValue);
	}
	
	public void selectDamageInsurance(String dmageValue) {
		Select damage = new Select(selectDamageIns);
		damage.selectByValue(dmageValue);
	}
	
	public void enterOptionalProduct() {
		Actions act = new Actions(driver);
		act.moveToElement(optionalPrdctTxt).click().perform();
	}
	
	public void selectCourtesy(String carValue) {
		Select car = new Select(selectCourtsey);
		car.selectByVisibleText(carValue);
		
	}
	
	public void clickPriceNextBtn() {
		priceNxtBtn.click();
	}



}
