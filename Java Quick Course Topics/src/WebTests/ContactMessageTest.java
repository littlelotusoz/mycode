package WebTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ContactPage;
import pageObjects.ContactResultPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LoginResultPage;
import pageObjects.SearchResults;


public class ContactMessageTest {
	
	WebDriver driver; //declare the driver for firefox.

	
	@Before //these had to be imported
	public void testSetup(){
		driver = new FirefoxDriver(); //instantiate the driver first
		
	}
	
	@After
	public void testShutdown() {
		driver.close();
		
		
	}
	@Test // annotation
	public void shouldSendContactMessage() {
		HomePage onHomePage = new HomePage(driver);
		onHomePage = onHomePage.navigateToWebApp();
		LoginPage onLoginPage = onHomePage.clickOnLogin();
		LoginResultPage onResultPage = onLoginPage.fillFormWithData().submitForm();
		Assert.assertTrue(onResultPage.getConfirmationMessage().isDisplayed());
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/form/div[1]/div[4]/input")).click();
		
		Assert.assertTrue(
		driver.findElement(By.className("subhead")).getText().equals("Contact Form")); //adding an assert to the find element
		
		driver.findElement(By.name("address_field")).sendKeys("This is address field");
		
		driver.findElement(By.cssSelector("[id=adoption_link]")).click();
		
		driver.findElement(By.linkText("HOME")).click();

		driver.findElement(By.partialLinkText("AB")).click();
		
		Assert.assertTrue(
		driver.findElement(By.tagName("p")).getText().contains("animals"));
		
		String title = driver.getTitle();
		
		if(title.equals("blah")){
			System.out.println("Found correct page with the value of" + title);	
		}	else
				{
					System.out.println("Instead found page with Title " + title);
					fail("Wrong fail");
				}
		
		//Assert.assertTrue("title bar incorrect", driver.getTitle().equals("Jobs - SEEK")); // confirm we are on the seek page by checking name of tab
		
		
/*		assertTrue(1==1);//confirm that 1 is equal to 1	
		assertFalse(1==2); // confirm that 1 is not equal to 2
		assertEquals("a", "a");
		
		String thisIsNull = null; //asserting that a value is null
		assertNotNull(thisIsNull);*/
				
		
	
		
}
	
}

