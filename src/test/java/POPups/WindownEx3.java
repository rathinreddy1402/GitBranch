package POPups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindownEx3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(4000);
Set<String> allWin = driver.getWindowHandles();
	
for (String string : allWin)
{
	driver.switchTo().window(string);
	String title = driver.getTitle(); //framework  //selenium
	System.out.println(title);
	if(title.contains("Selenium"))
	{
		break;
	}
}
driver.findElement(By.xpath("//span[text()='Projects']")).click();
//driver.findElement(By.xpath("//a[text()='Watch the Videos']"));
//Thread.sleep(1000);
	}}