package POPups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shobha/Desktop/mainPage.html");
		//driver.findElement(By.id("t2")).sendKeys("shobha");
		//switch to inner frame using index
		//driver.switchTo().frame(0);
	//	driver.findElement(By.id("t2")).sendKeys("shobha");
		//switch to inner frame using id
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("t2")).sendKeys("Rani");
//		WebElement sub = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		driver.switchTo().frame(sub);
//		driver.findElement(By.id("t2")).sendKeys("shobha");
	//	driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("shobha");
	}
}
