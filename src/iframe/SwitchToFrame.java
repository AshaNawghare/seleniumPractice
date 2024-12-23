package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
//		driver.switchTo().frame("iframeResult"); //string frame name
//		driver.switchTo().frame("iframeResult");  //frame index
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));   //webElement
		
		
		//click on date and time
		driver.findElement(By.xpath("//button[@type='button']")).click();

	}

}
