package AdvanceScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMulitpleWebElements {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));//366
	int count=0;
	for(WebElement link:allLinks)//1 //2
	{
		System.out.println(link.getText());//1 //2
		count++;//1 //2-----------------//366
	}
	System.out.println("Total num of links:"+count);
	}

}
