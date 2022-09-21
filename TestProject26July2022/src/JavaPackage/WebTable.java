package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/sectors/bse/realty");
		
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Total Companies : "+ allcompanies.size() );
		
		List<WebElement> cp = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		System.out.println("Total Prices : " + cp.size());
		
		String s = "Godrej Properties Ltd.";
		for(int i = 0 ; i<allcompanies.size(); i++)
		{
			if(allcompanies.get(i).getText().equalsIgnoreCase(s))
			{
				System.out.println(s + "Link Clicked" + cp );
				allcompanies.get(i).click();
				break;
			}
		}
		
	}

}
