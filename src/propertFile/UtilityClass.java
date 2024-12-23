package propertFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass
{
   public static String GEtTD(int RowIndex,int ColmIndex) throws EncryptedDocumentException, IOException 
   {
	   FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\selenium_14_15_2024\\TestData\\OrderSauce.xlsx");
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	   
	   String value = sh.getRow(RowIndex).getCell(ColmIndex).getStringCellValue();
	   
	   return value;
	   
   }
   
   public static String Pf(String key) throws IOException
   {
	  FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\selenium_14_15_2024\\Pf.properties");
	  
	  Properties p=new Properties();
	  p.load(file);
	  
	  
	  Object value = p.getProperty(key);
	  return (String) value;
	  
	  
   }
}
