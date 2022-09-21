package JavaPackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("C:\\Users\\Harshad\\eclipse-workspace\\TestProject26July2022\\Log4j.properties");
		
		logger.info("Launch the browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		logger.info("Browever Launched");
		driver.manage().window().maximize();
		logger.info("Maximized browser");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicite wait");
		driver.get("https://www.facebook.com/");
		logger.info("URL Hitted");
		
		
		

	}

}
