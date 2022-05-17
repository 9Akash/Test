package EXCEL1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class mix_rowdata1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\Owner\\Desktop\\sample.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	
	int lastcol=sh.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=lastcol;i++)
	{
		Cell cellinfo=sh.getRow(0).getCell(i);
		CellType s1 = cellinfo.getCellType();
		
		if (s1==CellType.STRING)
		{String sky=cellinfo.getStringCellValue();
		System.out.print(sky+" ");
		}
		
		else if(s1==CellType.NUMERIC)
		{
			double sky=cellinfo.getNumericCellValue();
			System.out.print(sky+" ");
		}
			
		else if(s1==CellType.BOOLEAN)
			{
				boolean sky=cellinfo.getBooleanCellValue();
				System.out.print(sky+" ");
			}
		}
	}
}

