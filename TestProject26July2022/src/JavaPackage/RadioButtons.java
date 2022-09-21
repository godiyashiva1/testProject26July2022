package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		// 1st way It is not a good approach to handle with multiple we elements
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='1']")).click();//Female 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();// Male
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();//Custome
		
		//2nd way
		Thread.sleep(3000);
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(radios.size());
		Thread.sleep(3000);
		radios.get(0).click();
		Thread.sleep(3000);
		radios.get(2).click();
		
		//3rd way - correct way
		Thread.sleep(3000);
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		
		String s = "Female";
		
		for (int i=0; i<radios1.size(); i++)
		{
			if(radios1.get(i).getText().equalsIgnoreCase(s))
			{
				radios1.get(i).click();
				System.out.println(s +" Clicked");
				break;
			}
				
		}
		
		
	}

}
