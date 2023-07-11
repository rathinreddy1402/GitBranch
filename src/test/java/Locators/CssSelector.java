package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//cssSelector using id()
		//Syntax--->[AttributeName="AttributeValue"]
		//driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys("admin");
		
		//Syntax--->htmltag[AttributeName="AttributeValue"]
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("admin");
		
            //Syntax--->htmltag#AttributeValue        id=#
		//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
      
		//cssSelector using class()
		//syntax----> [AttributeName="AttributeValue"]
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		
		//syntax---->htmltag[AttributeName="AttributeValue"]
		//driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		
		//Syntax--->htmltag.AttributeValue        class=.
       driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
      
     //Syntax--->[AttributeName="AttributeValue"]
		 //driver.findElement(By.cssSelector("[id=\"loginButton\"]")).click();
       
       //Syntax--->htmltag#AttributeValue        id=#
       driver.findElement(By.cssSelector("a#loginButton")).click();
	}

}
