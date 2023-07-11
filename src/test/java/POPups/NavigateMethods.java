package POPups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {

WebDriver driver=new ChromeDriver();
//launching url
driver.navigate().to("https://demo.actitime.com/login.do");
	
Thread.sleep(2000);
driver.navigate().back();
	
Thread.sleep(2000);
driver.navigate().forward();
	
Thread.sleep(2000);
driver.navigate().refresh();
	}

}
