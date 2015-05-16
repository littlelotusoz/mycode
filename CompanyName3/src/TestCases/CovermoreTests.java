package TestCases;

import static org.junit.Assert.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.bcel.generic.Select;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Package3.LoginPage;
import Package3.FirstTab;
import Package3.SignIn_Action;
import Package3.TripDetails;



public class CovermoreTests {
	
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
		driver.get(urlvariable);
		SignIn_Action.Execute(driver, "login", "password", "alphacode");
		LoginPage.Loginbutton(driver).click();
		
		}


@After
		public void testShutdown() {
		//driver.close();
		
		}
	
//@Test

		public void getTitle() {
	
		Assert.assertEquals(TripDetails.getTitle(driver), "Quote Box");
	
}
		
//@Test
		public void GetFirstSelectedOption() {
	
		Assert.assertEquals(TripDetails.typeofPolicy_Selection(driver), "Leisure");
	
}

//@Test 
		public void Getdropdowncontents_TypeOfPolicy() {
	
	Assert.assertTrue(
			TripDetails.typeOfPolicy_Dropdown(driver).getText().contains("Leisure"));
	Assert.assertTrue(
			TripDetails.typeOfPolicy_Dropdown(driver).getText().contains("Business"));
	Assert.assertTrue(
			TripDetails.typeOfPolicy_Dropdown(driver).getText().contains("Group"));
	Assert.assertTrue(
			TripDetails.typeOfPolicy_Dropdown(driver).getText().contains("Age Approved"));
	Assert.assertTrue(
			TripDetails.typeOfPolicy_Dropdown(driver).getText().contains("Direct"));
		
}

	//@Test
public void Getdropdowncontents_AreaOfTravel() {
			
			Assert.assertTrue(
					TripDetails.areaOfTravel_Dropdown(driver).getText().contains("Area"));
			Assert.assertTrue(
					TripDetails.areaOfTravel_Dropdown(driver).getText().contains("Worldwide (inc. Americas and Africa"));
			Assert.assertTrue(
					TripDetails.areaOfTravel_Dropdown(driver).getText().contains("Europe, Asia and the Middle East"));
			Assert.assertTrue(
					TripDetails.areaOfTravel_Dropdown(driver).getText().contains("UK and South East Asia"));
			Assert.assertTrue(
					TripDetails.areaOfTravel_Dropdown(driver).getText().contains("Indonesia, NZ and South West Pacific"));
			Assert.assertTrue(
					TripDetails.areaOfTravel_Dropdown(driver).getText().contains("Australia"));
			Assert.assertTrue(
					TripDetails.areaOfTravel_Dropdown(driver).getText().contains("Australia Inbound"));
				
		}
	
//@Test

		public void TestDropdownLocation() {
	Assert.assertEquals(TripDetails.actualDropdoqwnLocation(driver), TripDetails.expectedDropdownLocation(driver));
	
}

//@Test

public void selectFirstOption() {
	TripDetails.select_TypeOfPolicyOption(driver, 0);
	TripDetails.select_AreaOfTravel(driver, 5);
	
	wait(2);
	
	TripDetails.select_CountryMostTimeSpentIn(driver, 2);
		
}

//@Test
public void dates() {
	
Assert.assertEquals(TripDetails.getTodaysDate(driver), TripDetails.GetdefaultDepartureDate(driver));

}

@Test

public void selectDate() {

	TripDetails.departure_DatePicker(driver).click();
	TripDetails.departure_DatePicker(driver).sendKeys(TripDetails.addToDate(driver, 2));	
	TripDetails.returnDatePicker(driver).click();
	TripDetails.returnDatePicker(driver).sendKeys(TripDetails.addToDate(driver, 4));	
	TripDetails.byAge_RadioButton(driver).click();
	TripDetails.adultAges(driver, "28", "32");
	TripDetails.childAges(driver, "5", "10", "15", null);
}



}

