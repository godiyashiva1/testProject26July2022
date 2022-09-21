package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.getTitle();
		driver.findElement(By.xpath("//*[text() = 'Sign In']")).click();
		Thread.sleep(3000);
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames : " + allframes.size());
		
		for(int i=0 ; i<allframes.size(); i++)
		{
			driver.switchTo().frame(i);
			Thread.sleep(300);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
		}
	}

}
