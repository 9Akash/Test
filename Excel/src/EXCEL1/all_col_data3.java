package EXCEL1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class all_col_data3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream sk=new FileInputStream("C:\\\\Users\\\\Owner\\\\Desktop\\\\Sample2.xlsx");
	Sheet sht=WorkbookFactory.create(sk).getSheet("Sheet1");
	int lastrwind=sht.getLastRowNum();
	for(int i=0; i<=lastrwind;i++)
	{
		double val=sht.getRow(i).getCell(1).getNumericCellValue();
		System.out.println(val);
		
	}
	
}
}
