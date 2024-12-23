package propertFile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	 static WebDriver driver;
	
   public static void OpenBrowser() throws IOException
   {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get(UtilityClass.Pf("URL"));
   }
	
}
