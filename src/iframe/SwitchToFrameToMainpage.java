package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameToMainpage {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
//		driver.switchTo().frame("iframeResult");
//		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		//click on date and time
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//switch to main page
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//click on menu button
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();

	}

}
