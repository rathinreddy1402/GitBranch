package POPups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.className("initial")).click();
		
		driver.findElement(By.xpath("//div[.='Tasks']")).click();

		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
	driver.findElement(By.xpath("//div[@class='delete button']")).click();
	}

}
