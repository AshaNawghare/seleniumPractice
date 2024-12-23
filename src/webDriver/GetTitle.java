package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
//		
//		String Title = driver.getTitle();
//		System.out.println(Title);   //method used to get application title
		
		System.out.println(driver.getTitle());

	}

}
