package FrameWork;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ActiTimeRepo.LoginPage;

public class LoginEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp("admin", "admin");
	}

}
