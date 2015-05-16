package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class FirstTab2 extends AbstractPage2 {
		
		public FirstTab2(WebDriver driver) {
			super(driver);
		}
			
		public FirstTab2 testPageLocation()
		{
			driver.getTitle();
			return new FirstTab2(driver);
		}
		
		public FirstTab2 testTypePolicyDropdownVisible() 
		{
		driver.findElement(By.id("PurchasePathCode"));
	
		return this;
		}
	}

