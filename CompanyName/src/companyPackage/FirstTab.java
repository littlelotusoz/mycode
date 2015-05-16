package companyPackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTab extends AbstractPage {
	
	public FirstTab(WebDriver driver) {
		super(driver);
	}
		
	public String testPageLocation()
	{
		return driver.getTitle();
	}
	
	public WebElement policyDropdownDisplayed()
	{
		WebElement policydd = driver.findElement(By.id("PurchasePathCode"));
		return policydd;
		
	}
	

	public FirstTab Policydrop() {
		driver.findElement(By.id("PurchasePathCode")).isDisplayed();
		return new FirstTab(driver);
		
	
	
	}

}
