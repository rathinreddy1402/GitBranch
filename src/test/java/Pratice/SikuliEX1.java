package Pratice;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliEX1 {

	public static void main(String[] args) throws Throwable {
		
		Screen scr = new Screen();
        Pattern data = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\searchbar2.png");
        scr.click(data);
        scr.type(data, "notepad");
        
        Robot ro = new Robot();
        ro.keyPress(KeyEvent.VK_ENTER);
        ro.keyRelease(KeyEvent.VK_ENTER);
        
        Pattern data1 = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\mainPage.png"); 
        scr.click(data1);
        scr.type(data1, "Shobha");
       
	}

}
