package TestCases;

import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import Package3.LoginPage;
import Package3.FirstTab;
import Package3.SignIn_Action;
import Package3.TripDetails;
import Package3.ChooseCover_Page;

public class Test_TypeOfPolicy_Leisure {
	
	private static WebDriver driver = null;
	
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
	driver.get("");
	SignIn_Action.Execute(driver, login, password, alphacode);
	LoginPage.Loginbutton(driver).click();
	
	}


@After
	public void testShutdown() {
	driver.close();
	
	} 

@Test // Positive Test. To verify getting a quote where 'Type of Policy' is 'Leisure'. A 'Return date' is entered and 'By Age' radio button selected.

public void test_TOPLeisure_ReturnDate_ByAge() {
	TripDetails.select_TypeOfPolicy(driver, 0);
	TripDetails.select_AreaOfTravel(driver, 5);
	
	wait(2);
	
	TripDetails.select_CountryMostTimeSpentIn(driver, 2);
	TripDetails.departure_DatePicker(driver).click();
	TripDetails.departure_DatePicker(driver).sendKeys(TripDetails.addToDate(driver, 2));	
	TripDetails.returnDatePicker(driver).click();
	TripDetails.returnDatePicker(driver).sendKeys(TripDetails.addToDate(driver, 4));	
	TripDetails.byAge_RadioButton(driver).click();
	TripDetails.adult1_Adult2_Ages(driver, "28", "32");
	TripDetails.childAges(driver, "5", "10", "15", null);
	TripDetails.getAQuote_Button(driver).click();
	Assert.assertEquals(ChooseCover_Page.getTitle(driver), "Choose Cover");
	
}

@Test // Positive Test. To verify getting a quote where 'Type of Policy' is 'Leisure' and ' Annual Multi-Trip Only' selected and 'By DOB' radio button selected.

public void test_TOPLeisure_AMTO_ByDOB() {
	TripDetails.select_TypeOfPolicy(driver, 0);
	TripDetails.select_AreaOfTravel(driver, 5);
	
	wait(2);
	
	TripDetails.select_CountryMostTimeSpentIn(driver, 2);
	TripDetails.departure_DatePicker(driver).click();
	TripDetails.departure_DatePicker(driver).sendKeys(TripDetails.addToDate(driver, 2));	
	TripDetails.returnDatePicker(driver).click();
	TripDetails.returnDatePicker(driver).sendKeys(TripDetails.addToDate(driver, 4));	
	TripDetails.byDOB_RadioButton(driver);
	TripDetails.adultsDOB(driver, "12031982", "14041984");
	TripDetails.getAQuote_Button(driver).click();
	Assert.assertEquals(ChooseCover_Page.getTitle(driver), "Choose Cover");
	
}

@Test	//To verify that the 'Address Details' link points to the correct url.
public void test_AddressDetailsLink() {
Assert.assertEquals(TripDetails.aboutUsUrl_Link(driver), "http://www.companyname.com.au/about-us");
	
}


@Test //To verify that the sidebar appears when clicked and redirects to correct FAQ page.
public void test_SideBar() {
	
	driver.findElement(By.id("sidebar")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a")).click();
	Assert.assertTrue(driver.getCurrentUrl().equals("https://training-b2b.companyname.com/AU/Faq/index"));
	Assert.assertTrue(driver.getTitle().equals("FAQ"));
	driver.navigate().back();
	
}

	
}
	
	




