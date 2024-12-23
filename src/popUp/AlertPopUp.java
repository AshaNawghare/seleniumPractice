package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter customer id
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("101");
		
		Thread.sleep(1000);
		
		//click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//click on cancel button
//		driver.switchTo().alert().dismiss();
		
//		click on okay button
		driver.switchTo().alert().accept();
		
//		click on 2nd okay button
		driver.switchTo().alert().accept();
		
		

	}

}
