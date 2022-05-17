package EXCEL1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXCEL_1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream a=new FileInputStream("C:\\Users\\Owner\\Desktop\\sky.xlsx");
	double val=WorkbookFactory.create(a).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(val);
	
	}
}
