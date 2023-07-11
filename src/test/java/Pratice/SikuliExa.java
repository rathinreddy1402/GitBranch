package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliExa {

	@Test
	public void m1() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//svg:-Scalable vector Graphics
		//syntax:-//*[name()='svg']
		//driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']")).click();
			driver.findElement(By.cssSelector("svg[class='gb_h'] ")).click();
			
			Screen scr = new Screen();
			Pattern map = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\mapImg.png");
	scr.click(map);
	}
}
