package POPups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");

		//driver.get("https://username:password@url);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}