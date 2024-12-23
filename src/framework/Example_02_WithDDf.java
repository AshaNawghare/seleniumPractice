package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_02_WithDDf {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("D:\\java\\Automation\\get exelsheet\\Test data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		
		String UNValue = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UNValue);
		
		Thread.sleep(1000);
		
		String PWDVALUE = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWDVALUE);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String ActTitle = driver.getTitle();
		String ExpTitle = sh.getRow(0).getCell(2).getStringCellValue();
		
		if (ActTitle.equals(ExpTitle)) 
		{
			System.out.println("Tc pass");
		}
		else
		{
            System.out.println("Tc fail");
		}
		

	}

}
