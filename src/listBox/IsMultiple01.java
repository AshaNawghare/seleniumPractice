package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple01 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/java/attribute/newMulti.html");
		
		WebElement Country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(Country);
		
		boolean Result = s.isMultiple();
		System.out.println(Result);
		
		if (Result) 
		{
			 System.out.println("Element is MultiSselect");
		}
		else
		{
			 System.out.println("Element is SingleSelect");
		}

	}

}
