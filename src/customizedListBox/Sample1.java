package customizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		
		act.click(Month);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ENTER).perform();

	}

}
