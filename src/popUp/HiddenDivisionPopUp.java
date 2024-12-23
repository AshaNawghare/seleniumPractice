package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//click on login button
		driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();
		
		Thread.sleep(1000);
		
		//enter mobile no
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9980338914");

	}

}
