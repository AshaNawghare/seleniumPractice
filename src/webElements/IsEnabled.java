package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		boolean Result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(Result);
		
		if (Result) 
		{
			System.out.println("Element is Enabled");
		}
		else
		{
            System.out.println("Element is Dis-able");
		}

	}

}
