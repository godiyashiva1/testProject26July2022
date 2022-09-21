package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(4000);
		// 1st way
		List<WebElement> month = driver.findElements(By.xpath("//Select[@id='month']/option"));
		System.out.println("Total Items in the List :" + month.size());
		System.out.println(month.get(0).isEnabled());
		month.get(0).click();
		Thread.sleep(3000);
		
		//2nd way
		WebElement mt = driver.findElement(By.xpath("//Select[@id='month']"));
		Select mo = new Select(mt);
		mo.selectByIndex(2);// march
		mo.selectByVisibleText("Apr");// Apr
		mo.selectByValue("12");
		Thread.sleep(3000);
		
		//3rd way
		List<WebElement> mb = mo.getOptions();
		System.out.println("Total Months" + mb.size());
		for(int i =0 ; i < mb.size(); i++)
		{
			String s = "Aug";
			String f = mb.get(i).getText();
			if(f.equalsIgnoreCase(s))
			{
				mb.get(i).click();
			 System.out.println(s + " Clicked");
			}
		}
		driver.quit();
		
		
		
		
		
		
	}

}
