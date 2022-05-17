package EXCEL1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class mix_coldata1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream s=new FileInputStream("C:\\Users\\Owner\\Desktop\\sample.xlsx");
	Sheet sh=WorkbookFactory.create(s).getSheet("Sheet1");
	
	int lastrow=sh.getLastRowNum();
for(int i=0; i<=lastrow;i++)
{Cell cellinfo=sh.getRow(i).getCell(0);
CellType s1 = cellinfo.getCellType();

if(s1==CellType.STRING)
	{String m=cellinfo.getStringCellValue();
	System.out.println(m);}


else if
(s1==CellType.BOOLEAN)
	{boolean m=cellinfo.getBooleanCellValue();
	System.out.println(m);}

else if
(s1==CellType.NUMERIC)
{double m=cellinfo.getNumericCellValue();
	System.out.println(m);}
	}
}
}
