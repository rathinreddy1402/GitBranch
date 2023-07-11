package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shobha/Desktop/Example.html");
		WebElement data = driver.findElement(By.id("t1"));

		if(data.isEnabled())
		{
			data.sendKeys("shobha");
			}
		else
		{
			System.out.println("not enabled");
		}
		}
}
