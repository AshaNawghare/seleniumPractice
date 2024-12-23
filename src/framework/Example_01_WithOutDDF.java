package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_01_WithOutDDF {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		
		//enter user name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		
		Thread.sleep(1000);
		
		//Enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		
		//click on submit 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String ActTitle = driver.getTitle();
		String ExpTitle="Swag Labg";
		
		if (ActTitle.equals(ExpTitle)) 
		{
			System.out.println("Tc Pass");
		}
		else
		{
            System.out.println("Tc Fail");
		}
		
		
		

	}

}
