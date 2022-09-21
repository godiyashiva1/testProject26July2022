package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.getTitle();
		
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("All frames in the webpage : " + allframes.size());
		
		for (int i = 0 ; i < allframes.size(); i++)
		{
			driver.switchTo().frame(i);
			if(driver.findElement(By.id("draggable")).isDisplayed() && driver.findElement(By.id("droppable")).isDisplayed())
			{
				Actions ac = new Actions(driver);
				ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
				System.out.println("Frame# "+ i+1);
				
			}
			
		}
		
		
		
	}

}
