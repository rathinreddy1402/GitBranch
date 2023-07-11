package POPups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act=new Actions(driver);
		act.moveToElement(jobs).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Jobs by skill")).click();
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		  Thread.sleep(2000);
		
		 // driver.findElement(By.xpath("//span[text()='FIND JOBS']")).click();
		//switch to new window
		
	  String mainId = driver.getWindowHandle();
	  System.out.println(mainId);
	  
	  Thread.sleep(1000);
	  Set<String> allId = driver.getWindowHandles();
	  System.out.println(allId);
	  for(String id:allId)
	  {
		 
		  if(!mainId.equals(id))
		  {
			 
			  driver.switchTo().window(id);
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//span[text()='FIND JOBS']")).click();
			 // System.out.println(id);
		  }
	  }
	  
	  //Thread.sleep(2000);
	//  driver.switchTo().window(mainId);
	 
	}
}
