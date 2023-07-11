package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLessEx {

	@Test
	public void m1(){
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
	}

}
