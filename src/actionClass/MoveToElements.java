package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//lang
		WebElement Lang = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		
		//action class
		Actions act=new Actions(driver);
		
		act.moveToElement(Lang).perform();

	}

}
