package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled02 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		boolean Result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(Result);
		
		if (Result)
		{
		   System.out.println("Element is Enabled");	
		}
		else
		{
           System.out.println("Element is dis-abled");
		}

	}

}
