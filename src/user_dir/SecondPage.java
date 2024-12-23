package user_dir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage 
{
    @FindBy(xpath="//button[text()='ADD TO CART']") private WebElement AddToCart;
    @FindBy(xpath="//div[@class='shopping_cart_container']") private WebElement ClickOnICon;
    
    public SecondPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void ClickOnAddToCart()
    {
    	AddToCart.click();
    }
    
    public void ClickOnIcon()
    {
    	ClickOnICon.click();
    }
}
