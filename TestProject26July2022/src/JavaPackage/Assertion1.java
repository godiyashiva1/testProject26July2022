package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

	WebDriver driver;
	
	@Test
	public void TestCase(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.getTitle();
		driver.findElement(By.xpath("//input[@id = 'login-signin']")).click();
		String expected = driver.findElement(By.xpath("//p[@id = 'username-error']")).getText();
		String actual = "Sorry, we don't recognise this email address.";
		
		Assert.assertEquals(actual, expected);
		System.out.println("Equal Assertion Sucess");
		
		Assert.assertFalse(driver.findElement(By.xpath("//p[@id = 'username-error']")).isSelected());
		
		System.out.println("False Assertion Sucess");
		
	}
}
