package practiceDDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataBackToExcel {

	public static void main(String[] args) throws Throwable, IOException {

		FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\MultipleTestDataScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet2");
		Row row=sh.getRow(1);
		Cell cell=row.createCell(4);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("PASS");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\MultipleTestDataScript.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("=======Executed======");

	}

}
