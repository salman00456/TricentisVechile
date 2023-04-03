package com.tricentis.automobiles.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.base.Base;

public class SendQuotePagePOM extends Base{

	@FindBy(xpath = "//ul[@class='menu']//child::li[1]//a[text()='Automobile']")
	WebElement automobileLnk;

	@FindBy(xpath = "//a[text()='Truck']")
	WebElement truckLnk;

	@FindBy(xpath = "//a[contains(text(),'Motorcycle')]")
	WebElement motorcycleLnk;

	@FindBy(xpath = "//ul[@class='menu']//following::li[4]//a[text()='Camper']")
	WebElement camperLnk;
	
	@FindBy(xpath = "//*[@class='idealsteps-step']//select[@id='make']")
	WebElement selectMake;
	
	@FindBy(xpath = "//input[@id='engineperformance']")
	WebElement enginePerfmnceTxt;
	
	@FindBy(xpath = "//input[@id='dateofmanufacture']")
	WebElement manufactureTxt;
	
	@FindBy(xpath = "//label[text()='Number of Seats']//following::select[1]")
	WebElement selectNumSeat;
	
	@FindBy(xpath = "//label[text()='Fuel Type']//following::select[1]")
	WebElement selectFuel;
	
	@FindBy(xpath = "//label[text()='List Price [$]']//following::input[1]")
	WebElement priceTxt;
	
	@FindBy(xpath = "//label[text()='License Plate Number']//following::input[1]")
	WebElement licenseTxt;
	
	@FindBy(xpath = "//label[text()='Annual Mileage [mi]']//following::input[1]")
	WebElement mileageTxt;
	
	@FindBy(xpath = "//button[starts-with(@id,'nextenterinsurantdata')]")
	WebElement vehcileNxtBtn;
	
	@FindBy(xpath = "//input[starts-with(@id,'firstname')]")
	WebElement fnameTxt;
	
	@FindBy(xpath = "//input[starts-with(@id,'lastname')]")
	WebElement lnameTxt;
	
	@FindBy(xpath = "//input[starts-with(@name,'Date of Birth')]")
	WebElement dobTxt;
	
	@FindBy(xpath = "//*[@id=\\\"insurance-form\\\"]/div/section[2]/div[4]/p/label[1]/span")
	WebElement selectGender;
	
	@FindBy(xpath = "//input[starts-with(@id,'streetaddress')]")
	WebElement stAddressTxt;
	
	@FindBy(xpath = "//select[starts-with(@id,'country')]")
	WebElement selectCountry;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipcodeTxt;
	
	@FindBy(xpath = "//*[contains(@id,'city')]")
	WebElement cityNameTxt;
	
	@FindBy(xpath = "//select[@id='occupation']")
	WebElement selectOccupation;
	
	@FindBy(xpath = "//*[@id='speeding']")
	WebElement selectHobby;
	
	@FindBy(xpath = "//input[@id='website']")
	WebElement websiteTxt;
	
	@FindBy(xpath = "//button[starts-with(@id,'nextenterproductdata')]")
	WebElement insurantNxtBtn;
	
	@FindBy(xpath = "//*[text()='Start Date']//following::input[1]")
	WebElement startDateTxt;
	
	@FindBy(xpath = "//*[text()='Insurance Sum [$]']//following::select[1]")
	WebElement selectInsuranceSum;
	
	@FindBy(xpath = "//*[text()='Merit Rating']//following::select[1]")
	WebElement selectMerit;
	
	@FindBy(xpath = "//*[text()='Damage Insurance']//following::select[1]")
	WebElement selectDamageIns;
	
	@FindBy(xpath = "//*[@id='EuroProtection']")
	WebElement optionalPrdctTxt;
	
	@FindBy(xpath = "//*[text()='Courtesy Car']//following::select[1]")
	WebElement selectCourtsey;
	
	@FindBy(xpath = "//button[starts-with(@id,'nextselectpriceoption')]")
	WebElement priceNxtBtn;
	
	@FindBy(xpath = "//input[@id='selectgold']")
	WebElement selectGoldPlan;
	
	@FindBy(xpath = "//button[starts-with(@id,'nextsendquote')]")
	WebElement clickSendQuoteBtn;
	
	@FindBy(xpath = "//input[@id='email']") WebElement emailTxt;
	@FindBy(xpath = "//input[@id='phone']") WebElement phoneTxt;
	@FindBy(xpath = "//input[@id='username']") WebElement ussernameTxt;
	@FindBy(xpath = "//input[@id='password']") WebElement passwordTxt;
	@FindBy(xpath = "//input[@id='confirmpassword']") WebElement confrmPassTxt;
	@FindBy(xpath = "//textarea[@id='Comments']") WebElement commentTxt;
	
	public SendQuotePagePOM() {
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
	
	public void enterZipCode() {
		zipcodeTxt.sendKeys();
	}
	
	public void enterCity() {
		cityNameTxt.sendKeys();
	}
	
	//occupation need to write
	
	public void hobbies() {
		selectHobby.click();
	}
	
	public void enterWebSite() {
		websiteTxt.sendKeys();
	}
	
	public void clickNextBtn() {
		insurantNxtBtn.click();
	}
	
	public void enterStartDate() {
		startDateTxt.sendKeys();
	}
	
	public void selectInsurance() {
	Select selectSum = new Select(selectInsuranceSum);
	selectSum.selectByValue("");
	}
	
	public void selectMerit() {
		Select merit = new Select(selectMerit);
		merit.selectByValue("");
	}
	
	public void selectDamageInsurance() {
		Select damage = new Select(selectDamageIns);
		damage.selectByValue("");
	}
	
	public void enterOptionalProduct() {
		Actions act = new Actions(driver);
		act.moveToElement(optionalPrdctTxt).click().perform();
	}
	
	public void selectCourtesy() {
		Select car = new Select(selectCourtsey);
		car.selectByVisibleText("");
		
	}
	
	public void clickPriceNextBtn() {
		priceNxtBtn.click();
	}
	
	public void selectGoldPlan() {
		Actions gold = new Actions(driver);
		gold.moveToElement(selectGoldPlan).click().perform();
	}
	
	public void clickQuoteBtn() {
		clickSendQuoteBtn.click();
	}
	
	public void enterEmail() {
		emailTxt.sendKeys();
	}
	
	public void enterPhone() {
		phoneTxt.sendKeys();
	}
	
	public void enterUsername() {
		ussernameTxt.sendKeys();
	}
	
	public void enterPassword() {
		passwordTxt.sendKeys();
	}
	
	public void enterConfirmPass() {
		confrmPassTxt.sendKeys();
	}
	
	public void enterComment() {
		commentTxt.sendKeys();
	}

}
