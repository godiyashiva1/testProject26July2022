package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames : "+ allframes.size());
		driver.switchTo().frame(0);
		driver.findElement(By.id("draggable")).isDisplayed();
		Actions a = new Actions(driver);
		
		a.dragAndDropBy(driver.findElement(By.id("draggable")), 30, 30).build().perform();
				
	}

}
