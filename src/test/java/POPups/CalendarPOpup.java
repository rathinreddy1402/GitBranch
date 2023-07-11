package POPups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPOpup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='June 2023']"
				+ "/ancestor::div[@class='DayPicker-Month']"
				+ "/descendant::p[text()='20']")).click();*/
	}

}
