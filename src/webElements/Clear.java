package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kiran@1234");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text']")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sanghpal");
		
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		UN.sendKeys("sanghpal");
		Thread.sleep(1000);
		UN.clear();
		Thread.sleep(1000);
		UN.sendKeys("kiran");

	}

}
