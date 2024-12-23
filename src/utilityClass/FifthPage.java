package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPage 
{
   @FindBy(xpath="//button[text()='Open Menu']") private WebElement Menu;
   @FindBy(xpath="//a[text()='FINISH']") private WebElement Finish;
   
   public FifthPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void ClickOnMenu()
   {
	   Menu.click();
   }
   
   public void ClickOnFinish()
   {
	   Finish.click();
   }
}
