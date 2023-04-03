package com.tricentis.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.tricentis.base.Base;

public class Utility extends Base{
	
	/*
	 * sendKeys getText click Action class Wait
	 */
	
	public static void sendKeysByXpath(String locator, String value) {
		 driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public static void getText(String locator) {
		driver.findElement(By.xpath(locator)).getText();
	}
	
	public static void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public static void action(String locator) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(locator))).click().perform();
		
	}
	
	public static void select(String locator, String Value) {
		Select selectVisible = new Select(driver.findElement(By.xpath(locator)));
		selectVisible.selectByVisibleText(Value);
				
	}


	
	

}
