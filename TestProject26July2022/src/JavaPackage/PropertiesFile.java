package JavaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\Harshad\\eclipse-workspace\\TestProject26July2022\\Peroperties\\Prop_Repo.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));
		
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("ID"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("Pass"));
		
		

	}

}
