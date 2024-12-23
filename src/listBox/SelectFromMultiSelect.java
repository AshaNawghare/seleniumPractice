package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromMultiSelect {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/java/attribute/newMulti.html");
		
		WebElement Country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(Country);
		
		s.selectByVisibleText("IND");
		s.selectByVisibleText("PAK");
		s.selectByVisibleText("SRI");
		s.selectByVisibleText("AUS");

	}

}
