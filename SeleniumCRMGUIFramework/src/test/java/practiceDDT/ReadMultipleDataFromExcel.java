package practiceDDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("org");
		int rowCount=sh.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
		Row row=sh.getRow(i);
		String column1=row.getCell(i).toString();	
		String column2=row.getCell(i+1).toString();
		String column3=row.getCell(i+2).toString();
		System.out.println(column1+ "\t"+column2+"\t"+column3);
		}
		wb.close();
	}
	}
	

