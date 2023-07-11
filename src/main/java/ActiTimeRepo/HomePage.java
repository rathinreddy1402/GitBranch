package ActiTimeRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="//a[text()='View Time-Track']")
	private WebElement ViewLink;

public WebElement getViewLink() {
	return ViewLink;
}
	
   public void clickViewTimeTrack()
   {
	   ViewLink.click();
   }
}
