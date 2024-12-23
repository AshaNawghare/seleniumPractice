package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourthPage
{
    @FindBy(xpath="//input[@id='first-name']") private WebElement UN;
    @FindBy(xpath="//input[@id='last-name']")private WebElement LN;
    @FindBy(xpath="//input[@id='postal-code']")private WebElement pincode;
    @FindBy(xpath="//input[@type='submit']") private WebElement continue01;
    
    public FourthPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void EnterUn(String FirstName)
    {
    	UN.sendKeys(FirstName);
    }
    
    public void EnterLN(String lastName1)
    {
    	LN.sendKeys(lastName1);
    }
    
    public void EnterPinCode(String code)
    {
    	pincode.sendKeys(code);
    }
    
    public void ClickonContinue()
    {
    	continue01.click();
    }
}
