package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByLocators {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//user name
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
		Thread.sleep(1000);
		
		//password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kiran@123");
		
		Thread.sleep(1000);
		
		//login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
