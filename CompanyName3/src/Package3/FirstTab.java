package Package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTab extends LoginPage {
	
	WebDriver driver;
	
	public FirstTab (WebDriver driver) {
		super(driver);
		
	}

	public WebElement policyDropdownDisplayed()
	{
		return driver.findElement(By.id("PurchasePathCode"));
	
		
	}
	
	public String testPageLocation()
	{
		return driver.getTitle();
	}
	
}
