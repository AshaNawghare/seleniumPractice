package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//Sell
		WebElement Sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		
		Actions act=new Actions(driver);
				
		act.moveToElement(Sell).perform();		

	}

}
