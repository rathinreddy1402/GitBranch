package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsExs {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		
		//getCssValue()--->WebElement
	/*	WebElement font = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		String data = font.getCssValue("font-size");
        System.out.println(data);
        
        WebElement text = driver.findElement(By.xpath("//input[@name='email']"));
        String color = text.getCssValue("color");
	    System.out.println(color);*/
		
		//sendkeys(),submit(),click()
	/*	driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
	   WebElement search = driver.findElement(By.name("q"));
	   search.sendKeys("puma");
	  // search.click();
	   search.submit();*/
		
	/*	driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("nike");
		searchbox.submit();*/
		
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.cssSelector("input#username"));
		data.sendKeys("admin");
		Thread.sleep(3000);
		data.clear();*/
		
		//getLocation()--->webElement
	/*	driver.get("https://www.facebook.com/");
		WebElement data = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Point location = data.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		//getSize()----->WebElement
		 WebElement data2 = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Dimension size = data2.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//getRect()----->WebElement
		WebElement data3 = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Rectangle rec = data3.getRect();
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());*/
		
		
		driver.get("https://demo.actitime.com/login.do");
		/*WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("Logo not displayed");
		}*/
		
	/*	WebElement username = driver.findElement(By.id("username"));
		if(username.isEnabled())
		{
			username.sendKeys("admin");
		}
		else
		{
			System.out.println("not enabled");
		}
		
		WebElement password = driver.findElement(By.name("pwd"));
		if(password.isEnabled())
		{
			password.sendKeys("manager");
		}
		else
		{
			System.out.println("password field is not enabled");
		}*/
		
		/*WebElement value = driver.findElement(By.cssSelector("div.atLogoImg"));
		if(value.isEnabled())
		{
			value.click();
			
		}
		else
		{
			System.out.println("is enabled");
		}*/
		
		/*WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		if(check.isSelected())
		{
			System.out.println("box is checked");
		}
		else
		{
			System.out.println("box is not checked");
		}*/
		
		//getTagName()
	/*	WebElement data = driver.findElement(By.id("username"));
		String name = data.getTagName();
		System.out.println(name);
		
		WebElement data1 = driver.findElement(By.id("loginButton"));
		String value = data1.getTagName();
		System.out.println(value);*/
		
	/*	WebElement type = driver.findElement(By.id("username"));
		String value = type.getAriaRole();
		System.out.println(value);*/
		
		/*WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		String val = check.getAriaRole();
		System.out.println(val);*/
		
		//DOM:- Document object model
		//getDomAttribute()
	//	WebElement data = driver.findElement(By.id("username"));
		//data.sendKeys("admin");
		//System.out.println(data.getDomAttribute("class"));
		
	/*	//getDomProperty---->prints only for textbox field
	   WebElement data1 = driver.findElement(By.id("username"));
		System.out.println(data1.getDomProperty("placeholder"));
		
		WebElement password = driver.findElement(By.name("pwd"));
		System.out.println(password.getDomProperty("type"));
		
		//WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
	 //System.out.println(check.getDomProperty("id"));
	   WebElement login = driver.findElement(By.id("loginButton"));
		System.out.println(login.getDomProperty("onclick"));
		
		WebElement check = driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
		System.out.println(check.getDomProperty("for"));*/
		
//		//getAttribute()
	//WebElement data = driver.findElement(By.id("username"));
	//System.out.println(data.getAttribute("class"));
	
	/*driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	WebElement login = driver.findElement(By.id("loginButton"));
	/*Thread.sleep(1000);
	WebElement tasklink = driver.findElement(By.cssSelector("a.reports"));
	System.out.println(tasklink.getAccessibleName());
System.out.println(login.getAccessibleName());*/
	
	//	WebElement login = driver.findElement(By.id("loginButton"));
	//	System.out.println(login.getAccessibleName());
	
		  WebElement login = driver.findElement(By.id("loginButton"));
		  System.out.println(login.getText());
	}

}
