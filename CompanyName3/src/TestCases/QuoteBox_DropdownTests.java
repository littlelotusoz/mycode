
package TestCases;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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

public class QuoteBox_DropdownTests {
	
	
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
			
		@BeforeClass
			public static void testSetup(){
			driver = new FirefoxDriver();
			driver.get("urlvariable");
			SignIn_Action.Execute(driver, login, password, alphacode);
			LoginPage.Loginbutton(driver).click();		
			
		}

		@AfterClass
			public static void testShutdown() {
			//driver.close();	
			
		} 
		
	@Test // To verify that the 'Type of Policy' drop down has the expected values listed.
		public void test_TypeOfPolicyDropdown_HasExpectedDropdownValues() {
		Assert.assertEquals(TripDetails.typeOfPolicy_Dropdown(driver).getText(), TripDetails.typeOfPolicy_ExpectedDropdownValues());		
		
		}
		
	@Test // To verify that the 'Area of Travel' drop down has the expected values listed when Type of Policy is 'Leisure'.
		public void test_AreaOfTravelDropdown_HasExpectedValues_PolicyLeisure() {
		TripDetails.select_TypeOfPolicy(driver, 0);
		Assert.assertEquals(TripDetails.areaOfTravel_Dropdown(driver).getText(), TripDetails.areaOfTravel_ExpectedDropdownValues_PolicyLeisure());		
		
		}
	
	@Test // To verify that the 'Area of Travel' drop down has the expected values listed when Type of Policy is 'Business'.
		public void test_AreaOfTravelDropdown_HasExpectedValues_PolicyBusiness() {
		
		TripDetails.select_TypeOfPolicy(driver, 1);
		Assert.assertEquals(TripDetails.areaOfTravel_Dropdown(driver).getText(), TripDetails.businessPolicy_areaOfTravel_ExpectedDropdownValues());
		
		}
	
	@Test // To verify that the 'Area of Travel' drop down has the expected values listed when Type of Policy is 'Group'.
		public void test_AreaOfTravelDropdown_HasExpectedValues_PolicyGroup() {
		TripDetails.select_TypeOfPolicy(driver, 2);
		Assert.assertEquals(TripDetails.areaOfTravel_Dropdown(driver).getText(), TripDetails.areaOfTravel_ExpectedDropdownValues_PolicyGroupOrDirectOrAgeApproved());		
	
		}		
	
	@Test // To verify that the 'Area of Travel' drop down has the expected values listed when Type of Policy is 'Age Approved'.
		public void test_AreaOfTravelDropdown_HasExpectedValues_PolicyAgeApproved() {
		TripDetails.select_TypeOfPolicy(driver, 3);
		Assert.assertEquals(TripDetails.areaOfTravel_Dropdown(driver).getText(), TripDetails.areaOfTravel_ExpectedDropdownValues_PolicyGroupOrDirectOrAgeApproved());		

		}
	
	@Test // To verify that the 'Area of Travel' drop down has the expected values listed when Type of Policy is 'Direct'.
		public void test_AreaOfTravelDropdown_HasExpectedValues_PolicyDirect() {
		TripDetails.select_TypeOfPolicy(driver, 4);
		Assert.assertEquals(TripDetails.areaOfTravel_Dropdown(driver).getText(), TripDetails.areaOfTravel_ExpectedDropdownValues_PolicyGroupOrDirectOrAgeApproved());		

		}
		
	@Test //To verify that the 'Country most time spent in' drop down has the correct values when 'Area of Travel' set to 'Worldwide (inc. Americas and Africa)'.
		public void test_CountryMostTimeSpentIn_AreaOfTravel_Worldwide() throws FileNotFoundException {
		TripDetails.select_TypeOfPolicy(driver, 0);
		TripDetails.select_AreaOfTravel(driver, 1);
			wait(1);
		Assert.assertEquals(TripDetails.actualCountryMostTimeSpentIn_Array(driver), TripDetails.expectedWorldwideCountryArrayFromFile());
	
		}
	
	@Test //To verify that the 'Country most time spent in' drop down has the correct values when 'Area of Travel' set to 'Europe Asia and the Middle East)'.
		public void test_CountryMostTimeSpentIn_AreaOfTravel_Europe() throws FileNotFoundException {
		TripDetails.select_TypeOfPolicy(driver, 0);
		TripDetails.select_AreaOfTravel(driver, 2);
			wait(1);
		Assert.assertEquals(TripDetails.actualCountryMostTimeSpentIn_Array(driver), TripDetails.expectedEuropeCountryArrayFromFile());

		}	
	
	@Test //To verify that the 'Country most time spent in' drop down has the correct values when 'Area of Travel' set to 'UK and South East Asia'.
		public void test_CountryMostTimeSpentIn_AreaOfTravel_UK() throws FileNotFoundException {
		TripDetails.select_TypeOfPolicy(driver, 0);
		TripDetails.select_AreaOfTravel(driver, 3);
			wait(1);
		Assert.assertEquals(TripDetails.actualCountryMostTimeSpentIn_Array(driver), TripDetails.expectedUKCountryArrayFromFile());
		
		}	
	
	@Test //To verify that the 'Country most time spent in' drop down has the correct values when 'Area of Travel' set to 'Indonesia, NZ and South West Pacific'.
		public void test_CountryMostTimeSpentIn_AreaOfTravel_Indonesia() throws FileNotFoundException {
		TripDetails.select_TypeOfPolicy(driver, 0);
		TripDetails.select_AreaOfTravel(driver, 4);
			wait(1);
		Assert.assertEquals(TripDetails.actualCountryMostTimeSpentIn_Array(driver), TripDetails.expectedIndonesiaCountryArrayFromFile());
	
		}
	
	@Test //To verify that the 'Country most time spent in' drop down has the correct values when 'Area of Travel' set to 'Australia'.
		public void test_CountryMostTimeSpentIn_AreaOfTravel_Australia() throws FileNotFoundException {
		TripDetails.select_TypeOfPolicy(driver, 0);
		TripDetails.select_AreaOfTravel(driver, 5);
			wait(1);
		Assert.assertEquals(TripDetails.actualCountryMostTimeSpentIn_Array(driver), TripDetails.expectedAustralia_CountryArrayFromFile());

		}
	
	@Test //To verify that the 'Country most time spent in' drop down has the correct values when 'Area of Travel' set to 'Australia Inbound'.
		public void test_CountryMostTimeSpentIn_AreaOfTravel_AustraliaInbound() throws FileNotFoundException {
		TripDetails.select_TypeOfPolicy(driver, 0);
		TripDetails.select_AreaOfTravel(driver, 6);
			wait(1);
		Assert.assertEquals(TripDetails.actualCountryMostTimeSpentIn_Array(driver), TripDetails.expectedAustraliaInbound_CountryArrayFromFile());

		}
	
	
	
	

}
