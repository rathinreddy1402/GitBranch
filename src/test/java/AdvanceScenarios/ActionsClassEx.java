package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEx {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		
		//Example for moveToElement()
		/*driver.get("https://www.amazon.in/");
		WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
       Actions act = new Actions(driver);
	   act.moveToElement(data).perform();*/
		
		//Actions methods-----> sendKeys(),perform(),click(),build().
		/*driver.get("https://demo.actitime.com/login.do");
        WebElement UN = driver.findElement(By.id("username"));
        WebElement PW = driver.findElement(By.name("pwd"));
	    WebElement Login = driver.findElement(By.id("loginButton"));
	
	    Actions act = new Actions(driver);
//	    act.sendKeys(UN,"admin").perform();
//	    act.sendKeys(PW,"manager").perform();
//	    act.click(Login).perform();
	    act.sendKeys(UN,"admin").sendKeys(PW,"manager").click(Login).build().perform();*/
		
		//Actions method---->contextClick()
		/*driver.get("https://www.amazon.in/");
		WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
		Actions act = new Actions(driver);
		act.contextClick(data).perform();*/
		
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
    Actions act = new Actions(driver);
	/*act.dragAndDrop(drag, drop).perform();
    
     act.clickAndHold(drag).perform();
     act.release(drop).perform();*/
     
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement value = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act1=new Actions(driver);
		act1.doubleClick(value).perform();
   }

}
