package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignMent {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("BAngalore");
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		 WebElement data = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	data.sendKeys("india");
	
		/*driver.findElement(By.id("msdd")).click();
		
		driver.findElement(By.xpath("//a[text()='Danish']")).click();*/
		
		/*WebElement date = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		date.click();
	Select sel = new Select(date);
	sel.selectByIndex(1);*/
	}

}
