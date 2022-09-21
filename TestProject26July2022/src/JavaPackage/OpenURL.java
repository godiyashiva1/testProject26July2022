package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
	
	public static void main(String[] args) throws InterruptedException {

		//setting the properties of chrome browser and setting the chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		//Launching the Browser Instance
		WebDriver driver = new ChromeDriver();
		//miximize the window
		driver.manage().window().maximize();
		//Open URL
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		//Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		//back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//get the title of the page
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		//forward
		Thread.sleep(2000);
		driver.navigate().forward();
	  System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
