package EXCEL1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class all_col_data1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream s=new FileInputStream("C:\\Users\\Owner\\Desktop\\Sample2.xlsx");
Sheet sh=WorkbookFactory.create(s).getSheet("Sheet1");
int lastrowindex=sh.getLastRowNum();
for (int i=0; i<=lastrowindex; i++)
{String val=sh.getRow(i).getCell(0).getStringCellValue();
System.out.println(val);}

}
}
