package TestCases;

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

import Package3.LoginPage;
import Package3.SignIn_Action;
import Package3.TripDetails;

public class Test_QuoteBox_Negative {
	
private static WebDriver driver = null;
	
@Before
	public void testSetup(){
	driver = new FirefoxDriver();
	driver.get(urlvariable);
	SignIn_Action.Execute(driver, login, password, alphacode);
	LoginPage.Loginbutton(driver).click();
	
	}


@After
	public void testShutdown() {
	//driver.close();
	
	} 
	
@Test //Negative Test. To verify that field validation messages appear when the user does not select a value for: 'Area of Travel'.
	public void test_TOPLeisure_FieldValidation_AreaOfTravel() {

	TripDetails.select_TypeOfPolicy(driver, 0);
	TripDetails.byAge_RadioButton(driver).click();
	TripDetails.adult1_Adult2_Ages(driver, "28", "32");
	TripDetails.getAQuote_Button(driver).click();
	Assert.assertTrue(TripDetails.fieldValidationError(driver).contains("The Destination Area field is required."));

	}

@Test //Negative Test. To verify that field validation messages appear when the user does not select a value for: 'Country most time spent in'.
	public void test_TOPLeisure_FieldValidation_CountryMostTimeSpent() {

	TripDetails.select_TypeOfPolicy(driver, 0);
	TripDetails.select_AreaOfTravel(driver, 1);
	TripDetails.byAge_RadioButton(driver).click();
	TripDetails.adult1_Adult2_Ages(driver, "28", "32");
	TripDetails.getAQuote_Button(driver).click();

	Assert.assertTrue(TripDetails.fieldValidationError(driver).contains("Invalid Country Name."));

	}

@Test //Negative Test. To verify that field validation messages appear when the user does not select a value for: 'by DOB or by Age'.
	public void test_TOPLeisure_FieldValidation_AgeOrDOB() {
	TripDetails.select_TypeOfPolicy(driver, 0);
	TripDetails.select_AreaOfTravel(driver, 1);
	TripDetails.byAge_RadioButton(driver).click();
	TripDetails.getAQuote_Button(driver).click();
	Assert.assertTrue(TripDetails.fieldValidationError(driver).contains("At least one Age or DOB must be provided."));
	}
		

}
