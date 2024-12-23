package captureOfSpecificElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample1 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement Logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		
		File src = Logo.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\java\\Automation\\screenshot\\pqr.jpg");
		FileHandler.copy(src, dest);

	}

}
