package POPups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNavigation {

	public static void main(String[] args) {


	/*	ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.flipkart.com");*/
		
		 EdgeOptions options = new EdgeOptions();
	     options.addArguments("InPrivate");
	
	    WebDriver driver=new EdgeDriver(options);
	    driver.get("https://www.flipkart.com");
	}

}
