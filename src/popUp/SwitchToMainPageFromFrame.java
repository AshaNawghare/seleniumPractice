package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPageFromFrame {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		//click on new tab
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		//get all id
		Set<String> Allid = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(Allid);
		
		String ChildWindow = al.get(1);
		
		//switch to child window
		driver.switchTo().window(ChildWindow);
		
		//click on trainning
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		Thread.sleep(1000);
		
		
		driver.switchTo().window(al.get(0));
		
		//click on new window
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		

	

	}

}
