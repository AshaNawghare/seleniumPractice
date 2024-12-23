package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetBooleanVaue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
         FileInputStream file=new FileInputStream("D:\\java\\Automation\\get exelsheet\\Book1.xlsx");
         boolean Result = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
         System.out.println(Result);
	   
	}

}
