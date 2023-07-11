package Pratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionOfPage {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Dimension dimen = new Dimension(500, 600);
		driver.manage().window().setSize(dimen);
	
	Point point = new Point(500, 300);
	driver.manage().window().setPosition(point);
	}

}
