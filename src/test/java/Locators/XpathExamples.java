package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExamples {

	public static void main(String[] args) throws Throwable {

		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		/*driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		//xpath by index value
//driver.findElement(By.xpath("(//a[contains(@data-csa-c-slot-id,'nav_cs_4')])[1]")).click();
driver.findElement(By.xpath("(//a[contains(@data-csa-c-slot-id,'nav_cs_')])[5]")).click();*/
		
		driver.get("https://demo.actitime.com/login.do");
	//driver.findElement(By.xpath("//input[@name='username' and @id='username']")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[@placeholder='Password' or @id='pwd']")).sendKeys("manager");
	
	/*	 WebElement ele = driver.findElement(By.xpath("//a[.='Downshifter 11 Running Shoes For Men']/..//div[@class='_30jeq3']"));
			//.getText();
			  String text = ele.getText();
				
				System.out.println(text);
			////div[@class='_1YokD2 _3Mn1Gg']//div[@class='_1AtVbE col-12-12']/descendant::div[@class='_30jeq3 _1_WHN1'][number(translate(text(),'₹,',''))>60000]*/
	
	
	}

}
