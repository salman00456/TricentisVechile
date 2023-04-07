package com.tricentis.automobiles.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tricentis.automobiles.objectrepository.ObjectRepository;
import com.tricentis.base.Base;

public class HomePagePOM extends Base{

	@FindBy(xpath =ObjectRepository.automobileLnk)
	@CacheLookup
	WebElement automobileLnk;

	@FindBy(xpath =ObjectRepository.truckLnk)
	@CacheLookup
	WebElement truckLnk;

	@FindBy(xpath =ObjectRepository.motorcycleLnk)
	@CacheLookup
	WebElement motorcycleLnk;

	@FindBy(xpath =ObjectRepository.camperLnk)
	@CacheLookup
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
	
	public void clickOnAutomobile() {
		automobileLnk.click();
		
	}
	
	

}
