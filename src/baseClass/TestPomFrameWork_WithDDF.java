package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomFrameWork_WithDDF extends BaseClass
{
   static Sheet sh;
	static FirstPage first;

	 static SecondPage second;

	  static ThirdPage third;

	  static FourthPage fourth;
	  static FifthPage fifth;
	  
	  
   
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("D:\\java\\Automation\\get exelsheet\\OrderSauce.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		OpenBrowser();
		
		//---------------------------------------------------------------------------------
		 first=new FirstPage(driver);
		 
		 String UNVALUE = sh.getRow(0).getCell(0).getStringCellValue();
		 first.EnterUN(UNVALUE);
		 
		 Thread.sleep(1000);
		 
		 String PWDVALUE = sh.getRow(0).getCell(1).getStringCellValue();
		 first.EnterPWD(PWDVALUE);
		 
		 Thread.sleep(1000);
		 
		 first.ClickOnloginBtn();
		 
		 //------------------------------------------------------------------------------
		 
		  second=new SecondPage(driver);
		  
		  second.ClickOnAddToCart();
		  Thread.sleep(1000);
		  second.ClickOnIcon();
		  
		 //-----------------------------------------------------------------------------
		  
		   third=new ThirdPage(driver);
		  
		  third.ClickoNCheckOut();
		  
		 //-----------------------------------------------------------------------------------
		  
		   fourth=new FourthPage(driver);
		  
		   String FstName = sh.getRow(0).getCell(2).getStringCellValue();
		   fourth.EnterUn(FstName);
		   
		   Thread.sleep(1000);
		   
		   String LstName = sh.getRow(0).getCell(3).getStringCellValue();
		   fourth.EnterLN(LstName);
		   
		   Thread.sleep(1000);
		   
		   String PinCode = sh.getRow(0).getCell(4).getStringCellValue();
		   fourth.EnterPinCode(PinCode);
		   
		   Thread.sleep(1000);
		   
		   Thread.sleep(1000);
		   
		   fourth.ClickonContinue();
		   
		   //--------------------------------------------------------------------------
		   
		    fifth=new FifthPage(driver);
		    
		    fifth.ClickOnMenu();
		    
		    Thread.sleep(1000);
		    
		    fifth.ClickOnFinish();
		    
		   
		    
		  
		 
		 
		 
		 
		

	}

}
