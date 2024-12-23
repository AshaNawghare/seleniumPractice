package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDatainColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:\\java\\Automation\\get exelsheet\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lstRow = sh.getLastRowNum();
		
		for(int i=0;i<=lstRow-1;i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}

	}

}
