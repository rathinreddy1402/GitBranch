package Pratice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) throws Throwable {
		
		/*String key="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();*/
		
		//WebDriver driver=new ChromeDriver();
		
	/*	WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();*/
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	/*	WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();*/
		
		
/*	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	driver.manage().window().minimize();
	Thread.sleep(4000);*/
	}

}
