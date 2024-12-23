package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage 
{

	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//input[@type='submit']") private WebElement loginbtn;
	
	
	public FirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUN(String username)
	{
		UN.sendKeys(username);
	}
	
	public void EnterPWD(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void ClickOnloginBtn()
	{
		loginbtn.click();
	}
}
