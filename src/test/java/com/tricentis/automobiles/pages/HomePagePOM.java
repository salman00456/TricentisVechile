package com.tricentis.automobiles.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tricentis.base.Base;

public class HomePagePOM extends Base{

	@FindBy(xpath = "//ul[@class='menu']//child::li[1]//a[text()='Automobile']")
	WebElement automobileLnk;

	@FindBy(xpath = "//a[text()='Truck']")
	WebElement truckLnk;

	@FindBy(xpath = "//a[contains(text(),'Motorcycle')]")
	WebElement motorcycleLnk;

	@FindBy(xpath = "//ul[@class='menu']//following::li[4]//a[text()='Camper']")
	WebElement camperLnk;
	
	public HomePagePOM() {
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
	
	

}
