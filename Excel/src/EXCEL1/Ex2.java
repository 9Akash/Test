package EXCEL1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream a=new FileInputStream("C:\\Users\\Owner\\Desktop\\sky.xlsx");
	//String Sky=WorkbookFactory.create(a).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	boolean me=WorkbookFactory.create(a).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
	System.out.println(me);
	
}
}
