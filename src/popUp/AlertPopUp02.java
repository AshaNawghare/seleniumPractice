package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp02 {

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
		
		//switch to alert
		Alert Alt = driver.switchTo().alert();
		
		//click on cancel button
//		Alt.dismiss();
		
		//click on 1st okay button
		Alt.accept();
		
		Thread.sleep(1000);
		
		//click on 2nd okay button
		Alt.accept();
		

	}

}
