package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/java/Automation/locators/attribute/tagname.html");
		
		driver.findElement(By.tagName("input")).sendKeys("kiran");
		
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("input")).sendKeys("sanghpal");

	}

}
