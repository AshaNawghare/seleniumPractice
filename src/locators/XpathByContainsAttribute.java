package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//user name
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("kiran");
		
		Thread.sleep(1000);
		
		//password
		driver.findElement(By.xpath("//input[contains(@class,'_6luy _9npi')]")).sendKeys("kiran@123");
		
		Thread.sleep(1000);
		
		//click on login button
		driver.findElement(By.xpath("//button[contains(@class,'_4jy1 selected _51sy')]")).click(); 

	}

}
