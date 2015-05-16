package companyPackage;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTests extends TestCase {
	
public WebDriver driver; 
	
	

	
@Before
public void testSetup(){
	driver = new FirefoxDriver();
	
}

	
	@After
	//public void testShutdown() {
		//driver.close();
	
	
	@Test
	
	public void test1() {
		
		AbstractPage onAbstractPage = new AbstractPage(driver);
		LoginPage onLoginPage = onAbstractPage.navigateToWebApp();
		
		onLoginPage.navigateToWebApp();
		//onLoginPage = onLoginPage.enterLoginDetails();	
		//onLoginPage.userLogin();

			
	}
	
	
}




