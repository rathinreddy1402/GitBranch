package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SvgElement {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
driver.get("https://www.google.com/");
//svg:-Scalable vector Graphics
//syntax:-//*[name()='svg']
//driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']")).click();
	driver.findElement(By.cssSelector("svg[class='gb_h'] ")).click();
	
	Screen sc = new Screen();
	Pattern icon = new Pattern("C:\\Users\\Shobha\\eclipse-workspace\\ActiTime7to9\\youtubeicon.png");
	sc.click(icon);
	}
	}
