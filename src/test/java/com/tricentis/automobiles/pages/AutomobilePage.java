package com.tricentis.automobiles.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tricentis.base.Base;

public class AutomobilePage extends Base{
	
	@FindBy(xpath = "//a[@id='entervehicledata']")
	WebElement enterVehicleData;

	@FindBy(xpath = "//a[@id='enterinsurantdata']")
	WebElement enterInsuranceData;

	@FindBy(xpath = "//a[@id='enterproductdata']")
	WebElement enterProductData;

	@FindBy(xpath = "//a[@id='selectpriceoption']")
	WebElement selectPriceOption;
	
	@FindBy(xpath = "//a[@id='sendquote']")
	WebElement sendQuote;
	
	public AutomobilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public EnterVehicleDataPage clickOnEnterVehicleData() {
		enterVehicleData.click();
		return new EnterVehicleDataPage();
	}

}
