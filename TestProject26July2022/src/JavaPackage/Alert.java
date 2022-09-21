package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.getTitle();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		String a = driver.switchTo().alert().getText();
		System.out.println(a);
		String s = "Do you confirm Action?";
		
		if(a.equalsIgnoreCase(s))
		{
			driver.switchTo().alert().accept();
			
		}
		else
		{
			driver.switchTo().alert().dismiss();
		}
		
		
		
	}

}
