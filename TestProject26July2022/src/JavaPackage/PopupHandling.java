package JavaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(3000);
		Set<String> PopupId = driver.getWindowHandles();
		System.out.println(PopupId.size());
		Iterator<String> abc = PopupId.iterator();
		String w1 = abc.next();
		String w2 = abc.next();
		
		driver.switchTo().window(w2);
		System.out.println(w2);
		driver.getTitle();
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(w1);
		System.out.println(w1);
		driver.quit();
		
		
		
	}

}
