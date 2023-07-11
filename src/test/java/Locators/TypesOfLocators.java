package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TypesOfLocators {

	@Test
	public void actiTime()
	{
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//maximizing the screen
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		//Example of id() locator
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//Example of name()locator
		driver.findElement(By.name("pwd")).sendKeys("manager");

		//Example of className() locator
		//driver.findElement(By.className("textField")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("[class=\"initial\"]")).click();
		//driver.findElement(By.cssSelector("[id=\"loginButton\"]")).click();
		//driver.findElement(By.id("loginButton")).click();
	/*driver.findElement(By.className("initial")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("View Ti")).click();
	//driver.findElement(By.linkText("Lock Time-Track")).click();
	//driver.findElement(By.partialLinkText("View Time-Track")).click();
	Thread.sleep(2000);
	//driver.findElement(By.partialLinkText("View Ti")).click();*/
	}

}
