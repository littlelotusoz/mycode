package Covermore2Pacakge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage2;
import pageObjects.AbstractPage2;
import pageObjects.FirstTab2;



import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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

public class TrialTest {
	
FirstTab2 onFirstTab2;
LoginPage2 onLoginPage2;


		WebDriver driver; 

		
		@Before 
		public void testSetup(){
		
			
		}
		
		@After
		public void testShutdown() {
			//driver.close();
		
		}
		
		@Test
		
		public void test1() 
		{
		driver = new FirefoxDriver();
		{
			
			LoginPage2 onLoginPage2 = new LoginPage2(driver);
			onLoginPage2.navigateToWebApp();
			onLoginPage2.enterLoginDetails();
			FirstTab2 onFirstTab2 = onLoginPage2.userLogin();
			System.out.println(driver.getTitle());
			System.out.println(onFirstTab2.testPageLocation().toString());
			assertTrue(onFirstTab2.testPageLocation().toString().equalsIgnoreCase("Quote Box"));
			
		}
		}
	
		@Test
		
		public void test2() {
		
			//assertTrue(onFirstTab2.testPageLocation().equals("Quote Box"));
	
		
			
		}

	}

