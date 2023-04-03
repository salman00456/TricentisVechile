package com.tricentis.automobiles.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.base.Base;

public class EnterVehicleDetailPOM extends Base {
	
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
	
	public EnterVehicleDetailPOM() {
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

}
