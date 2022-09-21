package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching the chrome driver instance
		driver.manage().window().maximize();// Maximizing the chrome browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicitwait 
		
		driver.get("https://www.facebook.com/");// open url
		
		driver.findElement(By.id("email")).sendKeys("ABCD");
		
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("1234");
		
		
	}

}
