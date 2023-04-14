package com.tricentis.automobiles.objectrepository;

public class ObjectRepository {
	
	//ObjectRepositry for Home page
	
	public static final String automobileLnk ="//ul[@class='menu']//child::li[1]//a[text()='Automobile']";
	public static final String truckLnk = "//a[text()='Truck']";
	public static final String motorcycleLnk = "//a[contains(text(),'Motorcycle')]";
	public static final String camperLnk = "//ul[@class='menu']//following::li[4]//a[text()='Camper']";
	public static final String clickAutomoblLnk ="//ul[@class='menu']//child::li[1]//a[text()='Automobile']";
	
	//Enter vehicle data OR
	
	public static final String selectMake = "//*[@class='idealsteps-step']//select[@id='make']";
	public static final String enginePerfmnceTxt = "//input[@id='engineperformance']";
	public static final String manufactureTxt = "//input[@id='dateofmanufacture']";
	public static final String selectNumSeat = "//label[text()='Number of Seats']//following::select[1]";
	public static final String selectFuel = "//label[text()='Fuel Type']//following::select[1]";
	public static final String priceTxt = "//label[text()='List Price [$]']//following::input[1]";
	public static final String licenseTxt = "//label[text()='License Plate Number']//following::input[1]";
	public static final String mileageTxt = "//label[text()='Annual Mileage [mi]']//following::input[1]";
	public static final String vehcileNxtBtn = "//button[starts-with(@id,'nextenterinsurantdata')]";
	
	// Insurant Data page OR
	
	public static final String fnameTxt = "//input[starts-with(@id,'firstname')]";
	public static final String lnameTxt = "//input[starts-with(@id,'lastname')]";
	public static final String dobTxt = "//input[starts-with(@name,'Date of Birth')]";
	public static final String selectGender = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span";
	public static final String stAddressTxt = "//input[starts-with(@id,'streetaddress')]";
	public static final String selectCountry = "//select[starts-with(@id,'country')]";
	public static final String zipcodeTxt = "//input[@id='zipcode']";
	public static final String cityNameTxt = "//*[contains(@id,'city')]";
	public static final String selectOccupation = "//select[@id='occupation']";
	public static final String selectHobby = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span";
	public static final String websiteTxt = "//input[@id='website']";
	public static final String insurantNxtBtn  = "//button[starts-with(@id,'nextenterproductdata')]";
	
	//Product data page OR
	
	public static final String startDateTxt = "//*[text()='Start Date']//following::input[1]";
	public static final String selectInsuranceSum = "//*[text()='Insurance Sum [$]']//following::select[1]";
	public static final String selectMerit = "//*[text()='Merit Rating']//following::select[1]";
	public static final String selectDamageIns = "//*[text()='Damage Insurance']//following::select[1]";
	public static final String optionalPrdctTxt = "//*[@id='EuroProtection']";
	public static final String selectCourtsey = "//*[text()='Courtesy Car']//following::select[1]";
	public static final String priceNxtBtn = "//button[starts-with(@id,'nextselectpriceoption')]";
	
	//Price option page OR
	
	public static final String selectGoldPlan = "//input[@id='selectgold']";
	public static final String clickSendQuoteBtn = "//button[starts-with(@id,'nextsendquote')]";
	
	//Send quote page OR
	
	public static final String emailTxt = "//input[@id='email']";
	public static final String phoneTxt = "//input[@id='phone']";
	public static final String ussernameTxt = "//input[@id='username']";
	public static final String passwordTxt = "//input[@id='password']";
	public static final String confrmPassTxt = "//input[@id='confirmpassword']";
	public static final String commentTxt = "//textarea[@id='Comments']";
	
	
	

}
