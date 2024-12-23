package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckbox {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/java/attribute/multipleCheckbox.html");
		
		List<WebElement> AllCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement check:AllCheckbox)
		{
			check.click();
			Thread.sleep(1000);
		}

	}

}
