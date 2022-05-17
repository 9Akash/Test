package EXCEL1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream a=new FileInputStream("C:\\Users\\Owner\\Desktop\\sky.xlsx");
	int sky=WorkbookFactory.create(a).getSheet("Sheet1").getLastRowNum()+1;
	System.out.println(sky);
	
	FileInputStream b=new FileInputStream("C:\\Users\\Owner\\Desktop\\sky.xlsx");
	int sky1=WorkbookFactory.create(b).getSheet("Sheet1").getRow(2).getLastCellNum();
	System.out.println(sky1);
}
}
