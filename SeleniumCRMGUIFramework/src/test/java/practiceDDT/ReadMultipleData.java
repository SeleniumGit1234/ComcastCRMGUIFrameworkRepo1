package practiceDDT;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\MultipleTestDataScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				try
				{
				String data=cell.getStringCellValue();
				System.out.print(data+"\t");
				}catch(Exception e)
				{
					
				}
			}
			System.out.println();
		}
		wb.close();

	}

}
