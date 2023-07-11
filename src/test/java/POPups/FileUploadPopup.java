package POPups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
	Thread.sleep(2000);
	 WebElement data = driver.findElement(By.id("file-upload"));
	    data.sendKeys("C:\\Users\\Shobha\\Desktop\\PopupNotes.txt");
	}

}
