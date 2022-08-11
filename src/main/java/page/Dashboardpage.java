package page;

import java.time.Duration;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboardpage {
	@FindBy(xpath = "//*[@type='button']")
	WebElement getstartedbutton;

	@FindBy(xpath = "(//*[@type='text'])[2]")
	WebElement searchbox;

	@FindBy(xpath = "//*[@class='eight columns text-right']//*[@class='button-outline button-blue']")
	WebElement buybutton;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement finalbuybutton;

	WebDriver driver;

	public Dashboardpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchShares()
	{
		getstartedbutton.click();
		
		searchbox.sendKeys("SBIN");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
	}
	
	
	public void buyShare()
	{ 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(buybutton));
		buybutton.click();
		
		finalbuybutton.click();
	}
	
	
	
	

}
