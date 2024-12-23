package pom_FrameWork;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSwagLabLoginPagePom_withOut_DDF {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		
		SwagLabLoginPage login=new SwagLabLoginPage(driver);
		login.EnterUn();
		Thread.sleep(1000);
		login.EnterPWD();
		Thread.sleep(1000);
		login.ClickOnLoginBtn();
		

	}

}
