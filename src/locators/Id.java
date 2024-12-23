package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/java/Automation/locators/attribute/idi.html");
		
		driver.findElement(By.id("123")).sendKeys("kiran");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("456")).sendKeys("kiran");

	}

}
