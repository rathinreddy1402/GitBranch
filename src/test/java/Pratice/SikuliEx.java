package Pratice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliEx {

	@Test
	public void m1() throws Throwable {
	
		Screen sc = new Screen();
 Pattern min = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\mimBar.png");
 sc.click(min);
 
 Pattern search = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\searchbar1.png");
	sc.click(search);
	sc.type(search,"excel");
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	Pattern excel = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\excelsheet.png");
	sc.click(excel);
	}

}
