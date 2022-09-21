package JavaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcell {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Online_Training\\Excell\\Demo.xlsx");
		FileInputStream fis = new FileInputStream(src);// load file
		XSSFWorkbook w = new XSSFWorkbook(fis);// load wb
		XSSFSheet sh = w.getSheet("Sheet");
		System.out.println(sh.getSheetName());//loaded sheet name
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(4).getCell(1).getStringCellValue());
		System.out.println("Total # of Rows : "+ sh.getPhysicalNumberOfRows());
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getFirstRowNum());
		int rows = (sh.getLastRowNum() - sh.getFirstRowNum())+ 1; 
		System.out.println("Total # of Rows : "+ rows);
		
		System.out.println("Total # columns :" + sh.getRow(0).getPhysicalNumberOfCells());
		
		System.setProperty("webdriver.chrome.driver","C:\\Online_Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String a = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(a);
		
	}
}
