package EXCEL1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class all_row_data3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream s=new FileInputStream("C:\\\\Users\\\\Owner\\\\Desktop\\\\sample.xlsx");
	Sheet sht=WorkbookFactory.create(s).getSheet("Sheet1");
	int lastcol=sht.getRow(2).getLastCellNum()-1;
	for (int i=0;i<=lastcol;i++)
	{
	String	val=sht.getRow(2).getCell(i).getStringCellValue();
	System.out.print(val+"  ");
	
	}
}
}
