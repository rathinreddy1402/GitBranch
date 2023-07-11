package POPups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEx2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(4000);
		
		String mainId = driver.getWindowHandle();
		  System.out.println(mainId);
		  
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
	  for(String id:allIds)
		  {
			  if(!mainId.equals(id))
			  {
				  driver.switchTo().window(id);
				  driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
	}}
}}