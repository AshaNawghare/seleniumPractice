package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	 static WebDriver driver;
	
   public static void OpenBrowser()
   {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.saucedemo.com/v1/");
   }
	
}
