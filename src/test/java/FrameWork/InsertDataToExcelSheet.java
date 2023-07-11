package FrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelSheet {

	public static void main(String[] args) throws Throwable {
		
		 FileInputStream fes = new FileInputStream("./ExcelData7pm.xlsx");
		    //FileInputStream fes = new FileInputStream("C:\\Users\\Shobha\\Desktop\\ExcelData7pm.xlsx");
		    Workbook book = WorkbookFactory.create(fes);
		    Sheet sh = book.getSheet("Sheet1");
		    Row row = sh.createRow(4);
		     Cell cell = row.createCell(4);
		     cell.setCellValue("shobha");
		     
		     FileOutputStream fes1 = new FileOutputStream("./ExcelData7pm.xlsx");
		     book.write(fes1);
		     book.close();
	}

}
