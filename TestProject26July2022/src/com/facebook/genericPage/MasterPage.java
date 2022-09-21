package com.facebook.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;

	// constructor
	public MasterPage() throws Exception {
		// configure Proerties files
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\configuration.properties");

		prop = new Properties();
		prop.load(ip);

		// locators peroperties file

		// configure Proerties files
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\locators.properties");

		or = new Properties();
		or.load(fs);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshad\\eclipse-workspace\\TestProject26July2022\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (prop.getProperty("Browser").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ("user.dir") + "com.facebook.drivers\\geckdriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Open IE Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		driver.get(or.getProperty("URL"));
	}
	
	public void click(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void enterData(String xpathkey, String testdata) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(or.getProperty(testdata));
	}
	
	public void clearData(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}
	
	public void moveToElement(String xpathkey)
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	}
	
	public void clickListElement(String xpathkey, String testData)
	{
		List<WebElement> radios = driver.findElements(By.xpath(xpathkey));
		for(int i = 0; i<radios.size(); i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase(testData))
			{
				radios.get(i).click();
			}
		}
	}
	
	
	
	
	
}
