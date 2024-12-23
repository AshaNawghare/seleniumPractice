package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataInCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:\\java\\Automation\\get exelsheet\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lstCell = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lstCell;i++)
		{
			String Value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(Value+" ");
		}

	}

}
