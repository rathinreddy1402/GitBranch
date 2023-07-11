package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	@Test
	public void xpathExecution()
	{

		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		/*//xpath by Attribute
	//syntax---->//htmltag[@AttributeNAme='AttributeValue']
     //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
	Thread.sleep(1000);
	
	//syntax---->//htmltag[text()='AttributeValue']
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Approve Time-Track']")).click();*/
	
			driver.get("https://www.flipkart.com/");
			//driver.findElement(By.xpath("//button[.='✕']")).click();
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
	/*	driver.findElement(By.xpath("//div[text()='Fashion']")).click();*/
		/*driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();*/
}

}
