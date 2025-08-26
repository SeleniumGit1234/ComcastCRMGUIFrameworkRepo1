package practiceDDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable, IOException {
		
		FileInputStream fis=new FileInputStream("	C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("org");
		Row row=sh.getRow(1);
		Cell cell=row.getCell(2);
		String data=cell.getStringCellValue();	
		System.out.println(data);
		wb.close();
		

	}

}
