package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:\\java\\Automation\\get exelsheet\\Book1.xlsx");
		double NumValue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(NumValue);

	}

}
