package AdvanceScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
		driver.findElement(By.name("q")).sendKeys("nike");
		Thread.sleep(2000);
		List<WebElement> AllSuggestion = driver.findElements(By.tagName("li"));
		
		for(WebElement webEle:AllSuggestion)
		{
			if(webEle.getText().contains(" sneakers"))
			{
				webEle.click();
				break;
			}
		}
	}

}
