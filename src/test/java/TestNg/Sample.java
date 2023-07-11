package TestNg;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void m1() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
	driver.findElement(By.xpath("//a[.='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	
	FileInputStream fes = new FileInputStream("./ActiTime7to9/ExcelData7pm.xlsx");
	//get control of the path
	Workbook book = WorkbookFactory.create(fes);
	
	//get control of the sheet
	Sheet sheet = book.getSheet("Sheet1");
	
	//get control of the row
	Row row = sheet.getRow(0);
	
	//get control of the cell
	Cell cel = row.getCell(0);
	
	//fetch cell value
	String data = cel.getStringCellValue();
    System.out.println(data);
	 WebElement value = driver.findElement(By.id("name"));
	value.sendKeys(data);
	Thread.sleep(2000);
	System.out.println(value.getText());
     String finaldata = value.getText();
	Assert.assertEquals(data, finaldata);
	/*driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
	
	Alert alt = driver.switchTo().alert();
	//alt.accept();
	alt.dismiss();*/
	}
}
