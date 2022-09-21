package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		
		WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Actions a = new Actions (driver);
		a.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		a.contextClick(electronics).build().perform();
		
		Thread.sleep(2000);
		a.release(electronics).build().perform();
		
		//key events
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.xpath("//*[text()='Home']"));
		
		a.sendKeys(home, Keys.ENTER).build().perform();
		
		
		
		
		
	}

}
