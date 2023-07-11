package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suggestion {

		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			  WebDriver driver = WebDriverManager.chromedriver().create();
		        
		        driver.get("https://www.amazon.in/");
		        
		        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		        searchField.sendKeys("samsung s23 ultra");
		        
		        Thread.sleep(3000);
		       List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		       for (WebElement web : suggestions) 
		       {
				String text = web.getText();
				if(text.contains("samsung s23 ultra case"))
				{
					web.click();
					break;
				}
			}
		       Thread.sleep(5000);

	}

}
