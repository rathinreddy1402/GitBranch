package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class WaitsEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//syntax:-
	/*	Options opt = driver.manage();
		Timeouts time = opt.timeouts();
		time.implicitlyWait(20,TimeUnit.SECONDS);*/
		
		//version-3
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//version-4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement login = driver.findElement(By.className("initial"));
		
		//Explicity wait
	/*-	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(login));
		login.click();//timeoutExecption
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));*/
		
		//Fluent wait
		FluentWait wait2 = new FluentWait(driver);
		wait2.pollingEvery(Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(login));
	}

}
