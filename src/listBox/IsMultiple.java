package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
	    //step 1 : identify month
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
	    org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(Month);
	    
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
