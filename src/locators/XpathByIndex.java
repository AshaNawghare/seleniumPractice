package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		//Enter surname
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nawghare");
		
		Thread.sleep(1000);
		
		//Enter mobile number 
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("8830338914");

	}

}
