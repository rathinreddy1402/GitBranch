package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollByKeys {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
WebElement date = driver.findElement(By.id("day"));
Thread.sleep(2000);
date.click();
date.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);

	}

}
