package EXCEL1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class all_row_data {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream a=new FileInputStream("C:\\Users\\Owner\\Desktop\\sample.xlsx");
Sheet  sh=WorkbookFactory.create(a).getSheet("Sheet1");

int lastcell=sh.getRow(0).getLastCellNum()-1;

for(int i=0;i<=lastcell;i++)
{String me=sh.getRow(0).getCell(i).getStringCellValue();
System.out.print(me+"*");
}

}
}
