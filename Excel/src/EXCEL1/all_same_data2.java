package EXCEL1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class all_same_data2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream s=new FileInputStream("C:\\\\Users\\\\Owner\\\\Desktop\\\\Sample2.xlsx");
	Sheet sht=WorkbookFactory.create(s).getSheet("Sheet1");
	int lastrwind=sht.getLastRowNum();
	for(int i=0;i<=lastrwind;i++)
	{
		int lastcol=sht.getRow(i).getLastCellNum()-1;
		for (int j=0;  j<=lastcol; j++)
	{double val=sht.getRow(i).getCell(j).getNumericCellValue();
		System.out.print(val+ "|");}
		System.out.println();
		
	}
}
}
