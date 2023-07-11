package AdvanceScenarios;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionAmazonEx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nike");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		for (WebElement webElemen : list)
		{ 
			if (webElemen.getText().contains(" shoes for women"))
			{ 
				webElemen.click(); 
				break; 
				}
			}
		}
}
