package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSizeOfAllCheckBox {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/java/attribute/multipleCheckbox.html");
		
		int Size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(Size);
		
		
		

	}

}
