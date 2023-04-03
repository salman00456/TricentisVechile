package com.tricentis.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	/*
	 * @BeforeSuite
	 * 
	 * @BeforeTest
	 * 
	 * @BeforeClass
	 * 
	 * @BeforeMethod
	 * 
	 * @Test
	 * 
	 * @AfterMethod
	 * 
	 * @AfterClass
	 * 
	 * @AfterTest
	 * 
	 * @AfterSuite
	 */

	public static WebDriver driver;
	public static Properties prop;

	public Base() {

		// load locator.properties file
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\salma\\eclipse-workspace\\TricentisVechiles\\src\\test\\java\\com\\tricentis\\config\\locator.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// load config.properties file
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\salma\\eclipse-workspace\\TricentisVechiles\\src\\test\\java\\com\\tricentis\\config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void browserLaunch() throws IOException {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\salma\\eclipse-workspace\\TricentisVechiles\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\salma\\eclipse-workspace\\TricentisVechiles\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\salma\\eclipse-workspace\\TricentisVechiles\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("Please select Chrome, firefox or edge browser only");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://sampleapp.tricentis.com/101/index.php");

	}

}
