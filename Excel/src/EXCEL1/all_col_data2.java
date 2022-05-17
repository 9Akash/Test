package EXCEL1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//C:\\Users\\Owner\\Desktop\\Sample2.xlsx
public class all_col_data2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\Owner\\\\Desktop\\\\Sample2.xlsx");
	Sheet sht=WorkbookFactory.create(file).getSheet("Sheet1");
	int lastrwind=sht.getLastRowNum();
	for (int i=0; i<=lastrwind;i++)
	{double Val=sht.getRow(i).getCell(0).getNumericCellValue();
	System.out.println(Val);}
}
}
