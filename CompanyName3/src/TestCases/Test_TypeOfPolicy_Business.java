package TestCases;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Package3.LoginPage;
import Package3.FirstTab;
import Package3.SignIn_Action;
import Package3.TripDetails;
import Package3.ChooseCover_Page;

import org.junit.Test;
import org.junit.Test;

public class Test_TypeOfPolicy_Business {
	
	
private static WebDriver driver = null;
private int i;
		
public WebElement waitForPageElementVis(By locator, int maxSeconds) {
	return (new WebDriverWait (driver, 5000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

	public void wait(int seconds) {
		try {
				Thread.sleep(seconds * 1000);
					
			} catch (InterruptedException e) {
					e.printStackTrace();
		}
			}
		
@Before
		public void testSetup(){
		driver = new FirefoxDriver();
		driver.get(urlvariable);
		SignIn_Action.Execute(driver, login, password, alphacode);
		LoginPage.Loginbutton(driver).click();
		
		}

@After
		public void testShutdown() {
		driver.close();
		
		} 
@Test // Type of policy = 'Business' - Agent Rate = Yes -  Area = Worldwide(inc Americas), by DOB.
	
	public void test_TOPBusiness_StartDate_ByDOB() {
		TripDetails.select_TypeOfPolicy(driver, 1);
		TripDetails.agentRateYes_RadioButton(driver);
		TripDetails.select_AreaOfTravel(driver, 1);
		TripDetails.departure_DatePicker(driver).click();
		TripDetails.departure_DatePicker(driver).sendKeys(TripDetails.addToDate(driver, 2));	
		TripDetails.byDOB_RadioButton(driver);
		TripDetails.adultsDOB(driver, "12031982", "14041984");
		TripDetails.getAQuote_Button(driver).click();
		Assert.assertEquals(ChooseCover_Page.getTitle(driver), "PurchasePath Page");
}
@Test
	public void sadsd() {
		TripDetails.select_TypeOfPolicy(driver, 0);
		TripDetails.select_AreaOfTravel(driver, 1);
		TripDetails.departure_DatePicker(driver).click();
		TripDetails.departure_DatePicker(driver).sendKeys(TripDetails.addToDate(driver, 2));
		TripDetails.byDOB_RadioButton(driver).click();
		TripDetails.adultsDOB(driver, "12071982", "13091956");
		
	}
	
}

	

