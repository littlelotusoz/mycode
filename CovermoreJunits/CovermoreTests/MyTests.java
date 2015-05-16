package CovermoreTests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CovermorePackage.AbstractPage;
import CovermorePackage.LoginPage;
import CovermorePackage.TripDetailsTab;

public class MyTests {
	
public static void main(String[] args) {
		
	}

	WebDriver driver; 

	
	@Before 
	public void testSetup(){
		driver = new FirefoxDriver();
		
	}
	
	@After
	public void testShutdown() {
		//driver.close();
	
	}
	
	@Test
	
	public void test() {
		
		LoginPage onLoginPage = new LoginPage(driver);
		onLoginPage = onLoginPage.navigateToWebApp();
		//onLoginPage = onLoginPage.userLogin();
		//TripDetailsTab onTripDetailsTab = null;
		//onTripDetailsTab = onTripDetailsTab.location();
		//Assert.assertTrue(driver.getTitle().equals("Quote Box"));
		

	}

}
