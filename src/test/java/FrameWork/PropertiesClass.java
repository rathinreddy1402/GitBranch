package FrameWork;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ActiTimeRepo.HomePage;
import ActiTimeRepo.LoginPage;
public class PropertiesClass {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 //FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Desktop\\CommonData7pm.properties");
 
 /*FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Desktop\\CommonData7pm.properties");
 Properties pro = new Properties();
 pro.load(fis);
 String URL = pro.getProperty("url");
 String USERNAME = pro.getProperty("username");
 String PASSWORD = pro.getProperty("password");*/
		
		//driver.get(URL);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		//LoginPage login=new LoginPage(driver);
		/*login.getUserTextField().sendKeys(USERNAME);
		login.getPassWordTextField().sendKeys("manager");
		
		login.getLoginButton().click();*/
		//login.logToApplication(USERNAME, PASSWORD);
		
		LoginPage login=new LoginPage(driver);
		login.getUsernameTxtEdt().sendKeys("admin");
		Thread.sleep(2000);
		
		/*driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.className("initial")).click();*/
		//HomePage home=new HomePage(driver);
	//home.clickViewTimeTrack();
	}

}
