package FrameWork;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis= new FileInputStream("./propertiesData.properties");
		Properties pro = new Properties();
		pro.load(fis);
         String URL = pro.getProperty("url1");
	     driver.get(URL);
	
	     FileInputStream fes = new FileInputStream("./ExcelData7pm.xlsx");
	    //FileInputStream fes = new FileInputStream("C:\\Users\\Shobha\\Desktop\\ExcelData7pm.xlsx");
	    Workbook book = WorkbookFactory.create(fes);
	    Sheet sh = book.getSheet("Sheet1");
	    Row row = sh.getRow(0);
	     Cell cell = row.getCell(0);
	     String data = cell.getStringCellValue();
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data);
	}

}
