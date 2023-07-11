package Pratice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliExcelEx {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		Screen scr = new Screen();
Pattern minBar = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\mimBar.png");
scr.click(minBar);

Pattern search = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\searchingBAr.png");
scr.type(search, "Excel");

Robot ro = new Robot();
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);
	
	Pattern Excel = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\ExcelSheet1.png");
	scr.click(Excel);
	
	Pattern Excelcell = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\cell.png");
	scr.type(Excelcell, "shobha");
	}

}
