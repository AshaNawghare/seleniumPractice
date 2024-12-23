package user_dir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage 
{
   @FindBy(xpath="//a[text()='CHECKOUT']") private WebElement Checkout;
   
   public ThirdPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void ClickoNCheckOut()
   {
	   Checkout.click();
   }
}
