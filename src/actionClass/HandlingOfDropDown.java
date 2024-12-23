package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingOfDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//account and list
		WebElement AccAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		//action class
		Actions act=new Actions(driver);
		
		//move to elements
		act.moveToElement(AccAndList).perform();
		
		Thread.sleep(1000);
		
		//click on ex-showroom
		driver.findElement(By.xpath("//span[text()='Explore Showroom']")).click();
		

	}

}
