package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		//click on create new  account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//click on male radio button
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]")).click();

	}

}