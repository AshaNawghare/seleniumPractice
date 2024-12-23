package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		

	}

}
