package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); // launching the chrome driver instance
	driver.manage().window().maximize();// Maximizing the chrome browser
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicitwait
	driver.get("https://www.google.com/");// Open URL
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How stuff works");
	
	//Auto suggestions handling
	List<WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	System.out.println("Total # of Elements " + auto.size());
	for (int i = 0; i <auto.size() ; i++)
	{
		String s = "how stuff works quiz";
		String autos = auto.get(i).getText();
		if(autos.equalsIgnoreCase(s))
		{
			auto.get(i).click();
			System.out.println(s + " Clicked");
			break;
		}
		
	}
	driver.quit();
	
	}

}
