package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConti {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
	//	Example:-1
	/*	driver.get("https://demo.actitime.com/login.do");
       //xpath contains Attribute
		//syntax--->//htmltag[contains(@AttributeName,'AttributeValue')]
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");*/
		
		//Example:-2
		//xpath by contains Attribute
		//syntax----->//htmltag[contains(@AttributeName,'AttributeValue')]
		/*	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");*/
		
		//Example:-3
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'E')]")).sendKeys("48565484");*/
		
		//xpath by contains visibleText()
		//syntax:---->//htmltag[contains(text(),'AttributeValue')]
		//Example:-1
		driver.get("https://demo.actitime.com/login.do");
		/*driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Vie')]")).click();*/
	
		//Example:-2
		/*driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Gr')]")).click();*/
		
		//Multiple xpath
		//Using And nd Or opertor
		//driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.xpath("//input[@name='username' and @id='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password' or @id='pwd']")).sendKeys("manager");
	}

}
