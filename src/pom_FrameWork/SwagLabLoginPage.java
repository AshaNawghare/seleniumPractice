package pom_FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {

	@FindBy(xpath="//input[@type='password']") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//input[@type='submit']") private WebElement loginbtn;
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUn()
	{
		UN.sendKeys();
	}
	
	public void EnterPWD()
	{
		pwd.sendKeys();
	}
	
	public void ClickOnLoginBtn()
	{
		loginbtn.click();
	}
	

}
